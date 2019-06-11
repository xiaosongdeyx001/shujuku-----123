package com.opentravelsoft.report.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opentravelsoft.report.util.Parameter;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import org.efs.openreports.ORStatics;
import org.efs.openreports.ReportConstants.ExportType;
import org.efs.openreports.engine.ChartReportEngine;
import org.efs.openreports.engine.ReportEngine;
import org.efs.openreports.engine.ReportEngineHelper;
import org.efs.openreports.engine.input.ReportEngineInput;
import org.efs.openreports.engine.output.ChartEngineOutput;
import org.efs.openreports.engine.output.ReportEngineOutput;
import org.efs.openreports.objects.Report;
import org.efs.openreports.objects.ReportLog;
import org.efs.openreports.objects.ReportUser;
import org.efs.openreports.providers.DataSourceProvider;
import org.efs.openreports.providers.DirectoryProvider;
import org.efs.openreports.providers.PropertiesProvider;
import org.efs.openreports.providers.ProviderException;
import org.efs.openreports.providers.ReportLogProvider;
import org.efs.openreports.providers.ReportProvider;
import org.efs.openreports.util.LocalStrings;

public class ReportRunAction extends ActionSupport implements SessionAware {

  private static final long serialVersionUID = 7473180642590984527L;

  protected static Logger log = Logger.getLogger(ReportRunAction.class);

  private Map<Object, Object> session;

  private ReportProvider reportProvider;

  private ReportLogProvider reportLogProvider;

  private DirectoryProvider directoryProvider;

  private DataSourceProvider dataSourceProvider;

  private PropertiesProvider propertiesProvider;

  private List<Parameter> parameters = new ArrayList<Parameter>();

  private int reportId;

  public String execute() {
    ReportUser user = (ReportUser) ActionContext.getContext().getSession()
        .get(ORStatics.REPORT_USER);

    Report report = (Report) ActionContext.getContext().getSession()
        .get(ORStatics.REPORT);
    try {
      report = reportProvider.getReport(reportId);
    } catch (ProviderException e1) {
      e1.printStackTrace();
    }

    // int exportTypeCode = Integer.parseInt((String) ActionContext
    // .getContext().getSession().get(ORStatics.EXPORT_TYPE));

    ExportType exportType = ExportType.findByCode(0);

    switch (reportId) {
    case 1:
      // 旅游线路明细
      String invNo = null;
      for (Parameter param : parameters) {
        if (param.getName().equals("INV_NO"))
          invNo = param.getData();
      }
      break;

    }
    Map<String, Object> reportParameters = getReportParameterMap(user, report,
        exportType);
    for (Parameter param : parameters) {
      reportParameters.put(param.getName(), param.getData());
    }

    Map imagesMap = getImagesMap();

    HttpServletRequest request = ServletActionContext.getRequest();
    HttpServletResponse response = ServletActionContext.getResponse();

    // set headers to disable caching
    response.setHeader("Pragma", "public");
    response.setHeader("Cache-Control", "max-age=0");

    ReportLog reportLog = new ReportLog(user, report, new Date());
    reportLog.setExportType(exportType.getCode());

    try {
      if (exportType == ExportType.PDF) {
        // Handle "contype" request from Internet Explorer
        if ("contype".equals(request.getHeader("User-Agent"))) {
          response.setContentType("application/pdf");
          response.setContentLength(0);

          ServletOutputStream outputStream = response.getOutputStream();
          outputStream.close();

          return NONE;
        }
      }

      log.debug("Filling report: " + report.getName());

      reportLogProvider.insertReportLog(reportLog);

      ReportEngineInput reportInput = new ReportEngineInput(report,
          reportParameters);
      reportInput.setExportType(exportType);
      reportInput.setImagesMap(imagesMap);

      // add any charts
      if (report.getReportChart() != null) {
        log.debug("Adding chart: " + report.getReportChart().getName());

        ChartReportEngine chartEngine = new ChartReportEngine(
            dataSourceProvider, directoryProvider, propertiesProvider);

        ChartEngineOutput chartOutput = (ChartEngineOutput) chartEngine
            .generateReport(reportInput);

        reportParameters.put("ChartImage", chartOutput.getContent());
      }

      ReportEngineOutput reportOutput = null;

      ReportEngine reportEngine = ReportEngineHelper.getReportEngine(report,
          dataSourceProvider, directoryProvider, propertiesProvider);
      reportOutput = reportEngine.generateReport(reportInput);

      response.setContentType(reportOutput.getContentType());

      if (exportType != ExportType.HTML) {
        response.setHeader(
            "Content-disposition",
            "inline; filename="
                + StringUtils.deleteWhitespace(report.getName())
                + reportOutput.getContentExtension());
      }

      byte[] content = reportOutput.getContent();

      response.setContentLength(content.length);

      ServletOutputStream out = response.getOutputStream();
      out.write(content, 0, content.length);
      out.flush();
      out.close();

      reportLog.setEndTime(new Date());
      reportLog.setStatus(ReportLog.STATUS_SUCCESS);
      reportLogProvider.updateReportLog(reportLog);

      log.debug("Finished report: " + report.getName());
    } catch (Exception e) {
      if (e.getMessage() != null
          && e.getMessage().equals(LocalStrings.ERROR_REPORT_EMPTY)) {
        reportLog.setStatus(ReportLog.STATUS_EMPTY);
      } else {
        log.error(e.getMessage());

        reportLog.setMessage(e.getMessage());
        reportLog.setStatus(ReportLog.STATUS_FAILURE);
      }

      addActionError(getText(e.getMessage()));

      reportLog.setEndTime(new Date());

      try {
        reportLogProvider.updateReportLog(reportLog);
      } catch (Exception ex) {
        log.error("Unable to create ReportLog: " + ex.getMessage());
      }

      return ERROR;
    } finally {}

    return NONE;
  }

  @SuppressWarnings("unchecked")
  protected Map<String, Object> getReportParameterMap(ReportUser user,
      Report report, ExportType exportType) {
    Map<String, Object> reportParameters = new HashMap<String, Object>();

    if (ActionContext.getContext().getSession()
        .get(ORStatics.REPORT_PARAMETERS) != null) {
      reportParameters = (Map) ActionContext.getContext().getSession()
          .get(ORStatics.REPORT_PARAMETERS);
    }

    reportParameters.put(ORStatics.IMAGE_DIR,
        new File(directoryProvider.getReportImageDirectory()));
    reportParameters.put(ORStatics.REPORT_DIR,
        new File(directoryProvider.getReportDirectory()));
    reportParameters.put(ORStatics.EXPORT_TYPE_PARAM,
        new Integer(exportType.getCode()));

    return reportParameters;
  }

  protected Map getImagesMap() {
    // used by JasperReports HTML export
    // see ImageLoaderAction for more information
    Map imagesMap = null;
    if (ActionContext.getContext().getSession().get(ORStatics.IMAGES_MAP) != null) {
      imagesMap = (Map) ActionContext.getContext().getSession()
          .get(ORStatics.IMAGES_MAP);
    } else {
      imagesMap = new HashMap();
      session.put(ORStatics.IMAGES_MAP, imagesMap);
    }

    return imagesMap;
  }

  @SuppressWarnings("unchecked")
  public void setSession(Map session) {
    this.session = session;
  }

  public void setReportLogProvider(ReportLogProvider reportLogProvider) {
    this.reportLogProvider = reportLogProvider;
  }

  public void setDirectoryProvider(DirectoryProvider directoryProvider) {
    this.directoryProvider = directoryProvider;
  }

  public void setDataSourceProvider(DataSourceProvider dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  public void setPropertiesProvider(PropertiesProvider propertiesProvider) {
    this.propertiesProvider = propertiesProvider;
  }

  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  public void setReportId(int reportId) {
    this.reportId = reportId;
  }

  public void setReportProvider(ReportProvider reportProvider) {
    this.reportProvider = reportProvider;
  }
}