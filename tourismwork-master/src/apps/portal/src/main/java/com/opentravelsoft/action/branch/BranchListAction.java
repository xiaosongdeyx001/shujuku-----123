package com.opentravelsoft.action.branch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opentravelsoft.entity.Branch;
import com.opentravelsoft.service.portal.BranchService;
import com.opentravelsoft.webapp.action.PortalAction;

public class BranchListAction extends PortalAction {
  private static final long serialVersionUID = -1741200774989966991L;

  /** 得到营业部列表 */
  private List<Branch> branchs;

  @Autowired
  private BranchService branchService;

  public String excute() {
    // 得到营业部列表
    branchs = branchService.roGetBranchList();

    return SUCCESS;
  }

  public List<Branch> getBranchs() {
    return branchs;
  }

}
