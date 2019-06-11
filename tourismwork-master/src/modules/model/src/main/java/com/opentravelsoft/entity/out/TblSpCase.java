package com.opentravelsoft.entity.out;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_sp_case")
public class TblSpCase implements java.io.Serializable {

  private TblSpCaseId id;
  private Date SOutDate;
  private Date EOutDate;
  private String hotelLevel;
  private String hotelPos;
  private String pax;
  private String isLeader;
  private String customerSource;
  private String visaType;
  private String visaCountry;
  private BigDecimal airPrice;
  private BigDecimal hotelPrice;
  private BigDecimal quotePrice;
  private BigDecimal leaderPrice;
  private BigDecimal costPrice;
  private String flightInfo;
  private String flightType;
  private String remark;
  private String other;
  private String route;
  private String travelType;
  private Date opDate;
  private String opUser;
  private Date createDate;
  private String createUser;
  private String customerId;
  private String cptNo;
  private String lineNo;
  private String isSuccess;

  public TblSpCase() {
  }

  public TblSpCase(TblSpCaseId id, Date SOutDate, Date EOutDate,
      String customerId) {
    this.id = id;
    this.SOutDate = SOutDate;
    this.EOutDate = EOutDate;
    this.customerId = customerId;
  }

  public TblSpCase(TblSpCaseId id, Date SOutDate, Date EOutDate,
      String hotelLevel, String hotelPos, String pax, String isLeader,
      String customerSource, String visaType, String visaCountry,
      BigDecimal airPrice, BigDecimal hotelPrice, BigDecimal quotePrice,
      BigDecimal leaderPrice, BigDecimal costPrice, String flightInfo,
      String flightType, String remark, String other, String route,
      String travelType, Date opDate, String opUser, Date createDate,
      String createUser, String customerId, String cptNo, String lineNo,
      String isSuccess) {
    this.id = id;
    this.SOutDate = SOutDate;
    this.EOutDate = EOutDate;
    this.hotelLevel = hotelLevel;
    this.hotelPos = hotelPos;
    this.pax = pax;
    this.isLeader = isLeader;
    this.customerSource = customerSource;
    this.visaType = visaType;
    this.visaCountry = visaCountry;
    this.airPrice = airPrice;
    this.hotelPrice = hotelPrice;
    this.quotePrice = quotePrice;
    this.leaderPrice = leaderPrice;
    this.costPrice = costPrice;
    this.flightInfo = flightInfo;
    this.flightType = flightType;
    this.remark = remark;
    this.other = other;
    this.route = route;
    this.travelType = travelType;
    this.opDate = opDate;
    this.opUser = opUser;
    this.createDate = createDate;
    this.createUser = createUser;
    this.customerId = customerId;
    this.cptNo = cptNo;
    this.lineNo = lineNo;
    this.isSuccess = isSuccess;
  }

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "spId", column = @Column(name = "SP_ID", nullable = false, length = 10)),
      @AttributeOverride(name = "spQuoteId", column = @Column(name = "SP_QUOTE_ID", nullable = false)) })
  public TblSpCaseId getId() {
    return this.id;
  }

  public void setId(TblSpCaseId id) {
    this.id = id;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "S_OUT_DATE", nullable = false, length = 19)
  public Date getSOutDate() {
    return this.SOutDate;
  }

  public void setSOutDate(Date SOutDate) {
    this.SOutDate = SOutDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "E_OUT_DATE", nullable = false, length = 19)
  public Date getEOutDate() {
    return this.EOutDate;
  }

  public void setEOutDate(Date EOutDate) {
    this.EOutDate = EOutDate;
  }

  @Column(name = "HOTEL_LEVEL", length = 50)
  public String getHotelLevel() {
    return this.hotelLevel;
  }

  public void setHotelLevel(String hotelLevel) {
    this.hotelLevel = hotelLevel;
  }

  @Column(name = "HOTEL_POS", length = 50)
  public String getHotelPos() {
    return this.hotelPos;
  }

  public void setHotelPos(String hotelPos) {
    this.hotelPos = hotelPos;
  }

  @Column(name = "PAX", length = 50)
  public String getPax() {
    return this.pax;
  }

  public void setPax(String pax) {
    this.pax = pax;
  }

  @Column(name = "IS_LEADER", length = 1)
  public String getIsLeader() {
    return this.isLeader;
  }

  public void setIsLeader(String isLeader) {
    this.isLeader = isLeader;
  }

  @Column(name = "CUSTOMER_SOURCE", length = 1)
  public String getCustomerSource() {
    return this.customerSource;
  }

  public void setCustomerSource(String customerSource) {
    this.customerSource = customerSource;
  }

  @Column(name = "VISA_TYPE", length = 1)
  public String getVisaType() {
    return this.visaType;
  }

  public void setVisaType(String visaType) {
    this.visaType = visaType;
  }

  @Column(name = "VISA_COUNTRY", length = 20)
  public String getVisaCountry() {
    return this.visaCountry;
  }

  public void setVisaCountry(String visaCountry) {
    this.visaCountry = visaCountry;
  }

  @Column(name = "AIR_PRICE", precision = 9)
  public BigDecimal getAirPrice() {
    return this.airPrice;
  }

  public void setAirPrice(BigDecimal airPrice) {
    this.airPrice = airPrice;
  }

  @Column(name = "HOTEL_PRICE", precision = 9)
  public BigDecimal getHotelPrice() {
    return this.hotelPrice;
  }

  public void setHotelPrice(BigDecimal hotelPrice) {
    this.hotelPrice = hotelPrice;
  }

  @Column(name = "QUOTE_PRICE", precision = 9)
  public BigDecimal getQuotePrice() {
    return this.quotePrice;
  }

  public void setQuotePrice(BigDecimal quotePrice) {
    this.quotePrice = quotePrice;
  }

  @Column(name = "LEADER_PRICE", precision = 9)
  public BigDecimal getLeaderPrice() {
    return this.leaderPrice;
  }

  public void setLeaderPrice(BigDecimal leaderPrice) {
    this.leaderPrice = leaderPrice;
  }

  @Column(name = "COST_PRICE", precision = 9)
  public BigDecimal getCostPrice() {
    return this.costPrice;
  }

  public void setCostPrice(BigDecimal costPrice) {
    this.costPrice = costPrice;
  }

  @Column(name = "FLIGHT_INFO", length = 50)
  public String getFlightInfo() {
    return this.flightInfo;
  }

  public void setFlightInfo(String flightInfo) {
    this.flightInfo = flightInfo;
  }

  @Column(name = "FLIGHT_TYPE", length = 1)
  public String getFlightType() {
    return this.flightType;
  }

  public void setFlightType(String flightType) {
    this.flightType = flightType;
  }

  @Column(name = "REMARK")
  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Column(name = "OTHER")
  public String getOther() {
    return this.other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  @Column(name = "ROUTE")
  public String getRoute() {
    return this.route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  @Column(name = "TRAVEL_TYPE", length = 10)
  public String getTravelType() {
    return this.travelType;
  }

  public void setTravelType(String travelType) {
    this.travelType = travelType;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OP_DATE", length = 19)
  public Date getOpDate() {
    return this.opDate;
  }

  public void setOpDate(Date opDate) {
    this.opDate = opDate;
  }

  @Column(name = "OP_USER", length = 4)
  public String getOpUser() {
    return this.opUser;
  }

  public void setOpUser(String opUser) {
    this.opUser = opUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CREATE_DATE", length = 19)
  public Date getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Column(name = "CREATE_USER", length = 4)
  public String getCreateUser() {
    return this.createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  @Column(name = "CUSTOMER_ID", nullable = false, length = 10)
  public String getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  @Column(name = "CPT_NO", length = 10)
  public String getCptNo() {
    return this.cptNo;
  }

  public void setCptNo(String cptNo) {
    this.cptNo = cptNo;
  }

  @Column(name = "LINE_NO", length = 8)
  public String getLineNo() {
    return this.lineNo;
  }

  public void setLineNo(String lineNo) {
    this.lineNo = lineNo;
  }

  @Column(name = "IS_SUCCESS", length = 1)
  public String getIsSuccess() {
    return this.isSuccess;
  }

  public void setIsSuccess(String isSuccess) {
    this.isSuccess = isSuccess;
  }

}
