package com.opentravelsoft.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.opentravelsoft.entity.finance.Income;
import com.opentravelsoft.entity.finance.Invoice;

@Entity
@Table(name = "tbl_booking")
public class Booking implements java.io.Serializable {

  /** 订单号 */
  private String nameNo;
  /** 出团计划编号 */
  private Plan plan;
  /** 负责订单的组 */
  private Team team;
  /** 跟单人 */
  private Employee assigned;
  /** 客户 */
  private Customer customer;
  /** 联系人 */
  private String contact;
  /** 销售员 */
  private Employee salesman;
  /** 联系电话 */
  private String phone;
  /** 预订人数 */
  private Integer pax;
  /** 确认人数 */
  private Integer confirmPax;
  /** 应收款 */
  private BigDecimal dbamt;
  /** 已收款 */
  private BigDecimal cramt;
  /** 参团集合 A-个人,B-团体,C-商务团,D-代理商 */
  private String namekey;
  /** 来源 团体/代理商 */
  private String tourK1;
  private String delkey;
  private Integer opuser;
  private Date opTime;
  /** 预订人 */
  private Integer reserve;

  /** 预订日期 */
  private Date reserveDate;

  /** 合同 */
  private String pactNo;
  /** 是否可拆分 */
  private String tourKey;
  /** 备注 */
  private String remarks;
  /** 确认状态 1:团确 2:团候 */
  private String confirmStatus;
  /** 付款方式 */
  private String invKey;
  private Integer invUser;
  private Date invDate;
  /** 是否以阅读 */
  private String readKey;
  private Integer readUser;
  private Date readDate;
  /** 预订单来源 */
  private String planKey;
  /** 调整金额 */
  private BigDecimal finalAmount;
  /** 调整人 */
  private Integer finalUser;
  /** 调整日期 */
  private Date finalDate;
  /** 调整原因 */
  private String finalNote;
  /** 是否担保 */
  private String warrantFlag;
  /** 担保人 */
  private Integer warrantBy;
  /** 担保日期 */
  private Date warrantDate;
  /** 担保金额 */
  private BigDecimal warrantMoney;
  /** 最终付款时间 */
  private Date lastPayDate;
  /**
   * 订单来源 A-后台,W-网站,S-分销
   */
  private String source;
  private String workflowId;
  private String checkKey;
  private BigDecimal expAmt;
  /** 订单状态 */
  private String orderState;
  private Integer isAgreeon;
  private Integer memberId;

  private String lineNo;
  private String userName;
  private String fax;
  private String mobile;
  private String email;
  private String productType;
  private Integer adult;
  private Integer child;
  private Integer roomNum;
  private Integer productState;
  private Integer state;
  private Date outDate;
  private Byte userType;
  private Byte bookingSource;
  private Byte isDelete;
  private Integer createdBy;
  private Date createdDate;
  private String createdByIp;
  private String modifiedByIp;
  private Byte isNeedInvoice;
  private String invoiceHead;
  private String invoinceContent;
  private Byte postWay;

  public Booking() {
    confirmStatus = "2";
    delkey = "N";
    readKey = "N";
    customerList = new ArrayList<Tourist>();
    payments = new ArrayList<Income>();
    invices = new ArrayList<Invoice>();
    plan = new Plan();
    customer = new Customer();
    salesman = new Employee();
    payCosts = new BigDecimal(0);
  }

  public Booking(String nameNo, String namekey, Date opTime) {
    this.nameNo = nameNo;
    this.namekey = namekey;
    this.opTime = opTime;
  }

  @Id
  @Column(name = "NAME_NO", unique = true, nullable = false, length = 10)
  public String getNameNo() {
    return this.nameNo;
  }

  public void setNameNo(String nameNo) {
    this.nameNo = nameNo;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PLAN_NO")
  public Plan getPlan() {
    return this.plan;
  }

  public void setPlan(Plan planNo) {
    this.plan = planNo;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TEAM_ID")
  public Team getTeam() {
    return this.team;
  }

  public void setTeam(Team teamId) {
    this.team = teamId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ASSIGNED_USER_ID")
  public Employee getAssigned() {
    return this.assigned;
  }

  public void setAssigned(Employee assignedUserId) {
    this.assigned = assignedUserId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CUSTOMER_ID")
  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customerId) {
    this.customer = customerId;
  }

  @Column(name = "CONTACT", length = 20)
  public String getContact() {
    return this.contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  @Column(name = "PHONE", length = 60)
  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String tel) {
    this.phone = tel;
  }

  @Column(name = "PAX")
  public Integer getPax() {
    return this.pax;
  }

  public void setPax(Integer pax) {
    this.pax = pax;
  }

  @Column(name = "CONFIRM_PAX")
  public Integer getConfirmPax() {
    return this.confirmPax;
  }

  public void setConfirmPax(Integer confirmPax) {
    this.confirmPax = confirmPax;
  }

  @Column(name = "DBAMT", precision = 9)
  public BigDecimal getDbamt() {
    return this.dbamt;
  }

  public void setDbamt(BigDecimal dbamt) {
    this.dbamt = dbamt;
  }

  @Column(name = "CRAMT", precision = 9)
  public BigDecimal getCramt() {
    return this.cramt;
  }

  public void setCramt(BigDecimal cramt) {
    this.cramt = cramt;
  }

  @Column(name = "NAMEKEY", nullable = false, length = 1)
  public String getNamekey() {
    return this.namekey;
  }

  public void setNamekey(String namekey) {
    this.namekey = namekey;
  }

  @Column(name = "TOUR_K1", length = 1)
  public String getTourK1() {
    return this.tourK1;
  }

  public void setTourK1(String tourK1) {
    this.tourK1 = tourK1;
  }

  @Column(name = "DELKEY", length = 1)
  public String getDelkey() {
    return this.delkey;
  }

  public void setDelkey(String delkey) {
    this.delkey = delkey;
  }

  @Column(name = "OPUSER")
  public Integer getOpuser() {
    return this.opuser;
  }

  public void setOpuser(Integer opuser) {
    this.opuser = opuser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OP_TIME", nullable = false, length = 19)
  public Date getOpTime() {
    return this.opTime;
  }

  public void setOpTime(Date opTime) {
    this.opTime = opTime;
  }

  @Column(name = "RESERVE")
  public Integer getReserve() {
    return this.reserve;
  }

  public void setReserve(Integer reserve) {
    this.reserve = reserve;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "RESERVE_DATE", length = 19)
  public Date getReserveDate() {
    return this.reserveDate;
  }

  public void setReserveDate(Date reserveDate) {
    this.reserveDate = reserveDate;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SALESMAN")
  public Employee getSalesman() {
    return this.salesman;
  }

  public void setSalesman(Employee salesman) {
    this.salesman = salesman;
  }

  @Column(name = "PACT_NO", length = 16)
  public String getPactNo() {
    return this.pactNo;
  }

  public void setPactNo(String pactNo) {
    this.pactNo = pactNo;
  }

  @Column(name = "TOUR_KEY", length = 1)
  public String getTourKey() {
    return this.tourKey;
  }

  public void setTourKey(String tourKey) {
    this.tourKey = tourKey;
  }

  @Column(name = "REMARKS", length = 512)
  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @Column(name = "CFM_KEY", length = 1)
  public String getCfmKey() {
    return this.confirmStatus;
  }

  public void setCfmKey(String cfmKey) {
    this.confirmStatus = cfmKey;
  }

  @Column(name = "INV_KEY", length = 1)
  public String getInvKey() {
    return this.invKey;
  }

  public void setInvKey(String invKey) {
    this.invKey = invKey;
  }

  @Column(name = "INV_USER")
  public Integer getInvUser() {
    return this.invUser;
  }

  public void setInvUser(Integer invUser) {
    this.invUser = invUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "INV_DATE", length = 19)
  public Date getInvDate() {
    return this.invDate;
  }

  public void setInvDate(Date invDate) {
    this.invDate = invDate;
  }

  @Column(name = "READ_KEY", length = 1)
  public String getReadKey() {
    return this.readKey;
  }

  public void setReadKey(String readKey) {
    this.readKey = readKey;
  }

  @Column(name = "READ_USER")
  public Integer getReadUser() {
    return this.readUser;
  }

  public void setReadUser(Integer readUser) {
    this.readUser = readUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "READ_DATE", length = 19)
  public Date getReadDate() {
    return this.readDate;
  }

  public void setReadDate(Date readDate) {
    this.readDate = readDate;
  }

  @Column(name = "PLAN_KEY", length = 2)
  public String getPlanKey() {
    return this.planKey;
  }

  public void setPlanKey(String planKey) {
    this.planKey = planKey;
  }

  @Column(name = "FINAL_AMOUNT", precision = 11)
  public BigDecimal getFinalAmount() {
    return this.finalAmount;
  }

  public void setFinalAmount(BigDecimal finalAmount) {
    this.finalAmount = finalAmount;
  }

  @Column(name = "FINAL_USER")
  public Integer getFinalUser() {
    return this.finalUser;
  }

  public void setFinalUser(Integer finalUser) {
    this.finalUser = finalUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "FINAL_DATE", length = 19)
  public Date getFinalDate() {
    return this.finalDate;
  }

  public void setFinalDate(Date finalDate) {
    this.finalDate = finalDate;
  }

  @Column(name = "FINAL_NOTE", length = 200)
  public String getFinalNote() {
    return this.finalNote;
  }

  public void setFinalNote(String finalNote) {
    this.finalNote = finalNote;
  }

  @Column(name = "WARRANT_FLAG", length = 1)
  public String getWarrantFlag() {
    return this.warrantFlag;
  }

  public void setWarrantFlag(String warrantFlag) {
    this.warrantFlag = warrantFlag;
  }

  @Column(name = "WARRANT_BY")
  public Integer getWarrantBy() {
    return this.warrantBy;
  }

  public void setWarrantBy(Integer warrantBy) {
    this.warrantBy = warrantBy;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "WARRANT_DATE", length = 19)
  public Date getWarrantDate() {
    return this.warrantDate;
  }

  public void setWarrantDate(Date warrantDate) {
    this.warrantDate = warrantDate;
  }

  @Column(name = "WARRANT_MONEY", precision = 11)
  public BigDecimal getWarrantMoney() {
    return this.warrantMoney;
  }

  public void setWarrantMoney(BigDecimal warrantMoney) {
    this.warrantMoney = warrantMoney;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "LAST_PAY_DATE", length = 19)
  public Date getLastPayDate() {
    return this.lastPayDate;
  }

  public void setLastPayDate(Date lastPayDate) {
    this.lastPayDate = lastPayDate;
  }

  @Column(name = "SOURCE", length = 2)
  public String getSource() {
    return this.source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Column(name = "WORKFLOW_ID")
  public String getWorkflowId() {
    return this.workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  @Column(name = "CHECK_KEY", length = 1)
  public String getCheckKey() {
    return this.checkKey;
  }

  public void setCheckKey(String checkKey) {
    this.checkKey = checkKey;
  }

  @Column(name = "EXP_AMT", precision = 9)
  public BigDecimal getExpAmt() {
    return this.expAmt;
  }

  public void setExpAmt(BigDecimal expAmt) {
    this.expAmt = expAmt;
  }

  @Column(name = "ORDER_STATE", length = 1)
  public String getOrderState() {
    return this.orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }

  @Column(name = "IS_AGREEON")
  public Integer getIsAgreeon() {
    return this.isAgreeon;
  }

  public void setIsAgreeon(Integer isAgreeon) {
    this.isAgreeon = isAgreeon;
  }

  @Column(name = "MEMBER_ID")
  public Integer getMemberId() {
    return this.memberId;
  }

  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  @Column(name = "LineNo", length = 10)
  public String getLineNo() {
    return this.lineNo;
  }

  public void setLineNo(String lineNo) {
    this.lineNo = lineNo;
  }

  @Column(name = "UserName", length = 20)
  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Column(name = "Fax", length = 20)
  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  @Column(name = "Mobile", length = 20)
  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @Column(name = "Email", length = 45)
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "ProductType", length = 1)
  public String getProductType() {
    return this.productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  @Column(name = "Adult")
  public Integer getAdult() {
    return this.adult;
  }

  public void setAdult(Integer adult) {
    this.adult = adult;
  }

  @Column(name = "Child")
  public Integer getChild() {
    return this.child;
  }

  public void setChild(Integer child) {
    this.child = child;
  }

  @Column(name = "RoomNum")
  public Integer getRoomNum() {
    return this.roomNum;
  }

  public void setRoomNum(Integer roomNum) {
    this.roomNum = roomNum;
  }

  @Column(name = "ProductState")
  public Integer getProductState() {
    return this.productState;
  }

  public void setProductState(Integer productState) {
    this.productState = productState;
  }

  @Column(name = "State")
  public Integer getState() {
    return this.state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OutDate", length = 19)
  public Date getOutDate() {
    return this.outDate;
  }

  public void setOutDate(Date outDate) {
    this.outDate = outDate;
  }

  @Column(name = "UserType")
  public Byte getUserType() {
    return this.userType;
  }

  public void setUserType(Byte userType) {
    this.userType = userType;
  }

  @Column(name = "BookingSource")
  public Byte getBookingSource() {
    return this.bookingSource;
  }

  public void setBookingSource(Byte bookingSource) {
    this.bookingSource = bookingSource;
  }

  @Column(name = "IsDelete")
  public Byte getIsDelete() {
    return this.isDelete;
  }

  public void setIsDelete(Byte isDelete) {
    this.isDelete = isDelete;
  }

  @Column(name = "CreatedBy")
  public Integer getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CreatedDate", length = 19)
  public Date getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  @Column(name = "CreatedByIp", length = 45)
  public String getCreatedByIp() {
    return this.createdByIp;
  }

  public void setCreatedByIp(String createdByIp) {
    this.createdByIp = createdByIp;
  }

  @Column(name = "ModifiedByIp", length = 45)
  public String getModifiedByIp() {
    return this.modifiedByIp;
  }

  public void setModifiedByIp(String modifiedByIp) {
    this.modifiedByIp = modifiedByIp;
  }

  @Column(name = "IsNeedInvoice")
  public Byte getIsNeedInvoice() {
    return this.isNeedInvoice;
  }

  public void setIsNeedInvoice(Byte isNeedInvoice) {
    this.isNeedInvoice = isNeedInvoice;
  }

  @Column(name = "InvoiceHead", length = 100)
  public String getInvoiceHead() {
    return this.invoiceHead;
  }

  public void setInvoiceHead(String invoiceHead) {
    this.invoiceHead = invoiceHead;
  }

  @Column(name = "InvoinceContent", length = 100)
  public String getInvoinceContent() {
    return this.invoinceContent;
  }

  public void setInvoinceContent(String invoinceContent) {
    this.invoinceContent = invoinceContent;
  }

  @Column(name = "PostWay")
  public Byte getPostWay() {
    return this.postWay;
  }

  public void setPostWay(Byte postWay) {
    this.postWay = postWay;
  }


  /** 序号 */
  private int id;

  /** 是否可拆分 */
  private String canSplit;

  /** 客户月结/现结 */
  private String clearingCycle;

  /** 付款方式 */
  private String paymentType;

  /** 最终费用 */
  private BigDecimal finalExpense;

  /** 已付费用 */
  private BigDecimal payCosts;

  /** 未付费用 */
  private BigDecimal unPay;

  /** 现付费用 */
  private BigDecimal payBack;

  /** 付款状态 */
  private String paymentStatus;

  /** 占位状态 */
  private String placeStatus;

  /** 标记（可能是是否成团） */
  private String nameKey;

  /** 调整金额为 */
  private BigDecimal adjustExpense;

  /** 调整原因 */
  private String adjustReason;

  /** 上次调整人 */
  private Integer lastAdjustBy;

  /** 上次调整时间 */
  private Date lastAdjustDate;

  private int isSuccess;

  /** 收款日期 */
  private Date incomeDate;

  /** 收款人 */
  private String reserver;

  /** 代理商所在省份ID */
  private String region;

  /** 批数 */
  private int batch;

  /** 目的地编号 */
  private String districtNo;

  /** 国家 */
  private String country;

  /** 目的地 */
  private String district;

  /** 总人数 */
  private int sumpax;

  /** 总应收 */
  private BigDecimal sumDbamt;

  /** 总已收 */
  private BigDecimal sumCramt;

  /** 总未收 */
  private BigDecimal sumUnpay;

  private String leaders;

  /** 出团通知 */
  private String tourNoticeFilepath;

  /** 是否存在出团通知 */
  private String tourNoticeIsExist;

  /** 客人明晰 */
  private List<Tourist> customerList;

  /** 付款记录 */
  private List<Income> payments;

  /** 发票记录 */
  private List<Invoice> invices;

  // ----------------------------------
  // 配送任务
  /** 开始时间 */
  private Date start;

  /** 结束时间 */
  private Date end;

  private String info;

  private String checkOp;

  private Date checkDate;

  private String placeType;

  private Date updDate;

  private Date delDate;

  private String remark;

  @Override
  public Booking clone() throws CloneNotSupportedException {
    return (Booking) super.clone();
  }

  public void setPax(int pax) {
    this.pax = pax;
  }

  @Transient
  public String getCanSplit() {
    return canSplit;
  }

  public void setCanSplit(String canSplit) {
    this.canSplit = canSplit;
  }

  @Transient
  public List<Tourist> getCustomerList() {
    return customerList;
  }

  public void setCustomerList(List<Tourist> customerList) {
    this.customerList = customerList;
  }

  public void addCustomer(Tourist tourist) {
    customerList.add(tourist);
  }

  @Transient
  public BigDecimal getPayCosts() {
    return payCosts;
  }

  public void setPayCosts(BigDecimal payCosts) {
    this.payCosts = payCosts;
  }

  @Transient
  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  @Transient
  public String getPlaceStatus() {
    return placeStatus;
  }

  public void setPlaceStatus(String placeStatus) {
    this.placeStatus = placeStatus;
  }

  @Transient
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  @Transient
  public List<Invoice> getInvices() {
    return invices;
  }

  public void setInvices(List<Invoice> invices) {
    this.invices = invices;
  }

  @Transient
  public List<Income> getPayments() {
    return payments;
  }

  /**
   * @param payments
   */
  public void setPayments(List<Income> payments) {
    this.payments = payments;
  }

  @Transient
  public String getNameKey() {
    return nameKey;
  }

  public void setNameKey(String nameKey) {
    this.nameKey = nameKey;
  }

  @Transient
  public BigDecimal getPayBack() {
    return payBack;
  }

  public void setPayBack(BigDecimal payBack) {
    this.payBack = payBack;
  }

  @Transient
  public BigDecimal getUnPay() {
    return unPay;
  }

  public void setUnPay(BigDecimal unPay) {
    this.unPay = unPay;
  }

  @Transient
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Transient
  public BigDecimal getAdjustExpense() {
    return adjustExpense;
  }

  public void setAdjustExpense(BigDecimal adjustExpense) {
    this.adjustExpense = adjustExpense;
  }

  @Transient
  public String getAdjustReason() {
    return adjustReason;
  }

  public void setAdjustReason(String adjustReason) {
    this.adjustReason = adjustReason;
  }

  @Transient
  public Integer getLastAdjustBy() {
    return lastAdjustBy;
  }

  public void setLastAdjustBy(Integer lastAdjustBy) {
    this.lastAdjustBy = lastAdjustBy;
  }

  @Transient
  public Date getLastAdjustDate() {
    return lastAdjustDate;
  }

  public void setLastAdjustDate(Date lastAdjustDate) {
    this.lastAdjustDate = lastAdjustDate;
  }

  @Transient
  public int getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(int isSuccess) {
    this.isSuccess = isSuccess;
  }

  @Transient
  public String getLeaders() {
    return leaders;
  }

  public void setLeaders(String leaders) {
    this.leaders = leaders;
  }

  @Transient
  public BigDecimal getFinalExpense() {
    return finalExpense;
  }

  public void setFinalExpense(BigDecimal finalExpense) {
    this.finalExpense = finalExpense;
  }

  @Transient
  public String getClearingCycle() {
    return clearingCycle;
  }

  public void setClearingCycle(String clearingCycle) {
    this.clearingCycle = clearingCycle;
  }

  @Transient
  public int getBatch() {
    return batch;
  }

  public void setBatch(int batch) {
    this.batch = batch;
  }

  @Transient
  public int getSumpax() {
    return sumpax;
  }

  public void setSumpax(int sumpax) {
    this.sumpax = sumpax;
  }

  @Transient
  public BigDecimal getSumDbamt() {
    return sumDbamt;
  }

  public void setSumDbamt(BigDecimal sumDbamt) {
    this.sumDbamt = sumDbamt;
  }

  @Transient
  public BigDecimal getSumCramt() {
    return sumCramt;
  }

  public void setSumCramt(BigDecimal sumCramt) {
    this.sumCramt = sumCramt;
  }

  @Transient
  public BigDecimal getSumUnpay() {
    return sumUnpay;
  }

  public void setSumUnpay(BigDecimal sumUnpay) {
    this.sumUnpay = sumUnpay;
  }

  @Transient
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  @Transient
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  @Transient
  public String getDistrictNo() {
    return districtNo;
  }

  public void setDistrictNo(String districtNo) {
    this.districtNo = districtNo;
  }

  @Transient
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Transient
  public String getTourNoticeFilepath() {
    return tourNoticeFilepath;
  }

  public void setTourNoticeFilepath(String tourNoticeFilepath) {
    this.tourNoticeFilepath = tourNoticeFilepath;
  }

  @Transient
  public String getTourNoticeIsExist() {
    return tourNoticeIsExist;
  }

  public void setTourNoticeIsExist(String tourNoticeIsExist) {
    this.tourNoticeIsExist = tourNoticeIsExist;
  }

  @Transient
  public Date getIncomeDate() {
    return incomeDate;
  }

  public void setIncomeDate(Date incomeDate) {
    this.incomeDate = incomeDate;
  }

  @Transient
  public String getReceiver() {
    return reserver;
  }

  public void setReceiver(String reserver) {
    this.reserver = reserver;
  }

  @Transient
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  @Transient
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  @Transient
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Transient
  public String getBookingNo() {
    return nameNo;
  }

  public void setBookingNo(String bookingNo) {
    this.nameNo = bookingNo;
  }

  @Transient
  public String getCheckOp() {
    return checkOp;
  }

  public void setCheckOp(String checkOp) {
    this.checkOp = checkOp;
  }

  @Transient
  public Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(Date checkDate) {
    this.checkDate = checkDate;
  }

  @Transient
  public String getPlaceType() {
    return placeType;
  }

  public void setPlaceType(String placeType) {
    this.placeType = placeType;
  }

  @Transient
  public Date getUpdDate() {
    return updDate;
  }

  public void setUpdDate(Date updDate) {
    this.updDate = updDate;
  }

  @Transient
  public Date getDelDate() {
    return delDate;
  }

  public void setDelDate(Date delDate) {
    this.delDate = delDate;
  }

  @Transient
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
