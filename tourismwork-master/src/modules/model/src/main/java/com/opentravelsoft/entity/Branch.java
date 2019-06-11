package com.opentravelsoft.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tbl_branch")
public class Branch implements java.io.Serializable {

  private int branchId;
  private String agentnm;
  private String agentabb;
  private String agentadd;
  private String agentzip;
  private String agenttel;
  private String agentfax;
  private String citycd;
  private String manager;
  private String sales;
  private String email;
  private String areaId;
  private String remarks;
  private String opKey;
  private Integer opUser;
  private Date opDate;
  private String webKey;
  private BigDecimal arrearage;
  private String warnKey;
  private BigDecimal payment;
  private String reckoning;
  private String agentType;
  private String bussTime;
  private String comeandgo;
  private String gmTel;
  private String gmTalk;
  private String phoneFile1;

  /** 门店地图文件 */
  private String mapFile;
  private String phoneFile2;
  private Integer createUser;
  private Date createDate;
  private String checkKey;

  public Branch() {
  }

  public Branch(int branchId, String agentnm, String agentabb, String agentadd,
      String agentzip, String agenttel, String agentfax, String citycd,
      String manager, String sales, Date opDate) {
    this.branchId = branchId;
    this.agentnm = agentnm;
    this.agentabb = agentabb;
    this.agentadd = agentadd;
    this.agentzip = agentzip;
    this.agenttel = agenttel;
    this.agentfax = agentfax;
    this.citycd = citycd;
    this.manager = manager;
    this.sales = sales;
    this.opDate = opDate;
  }

  public Branch(int branchId, String agentnm, String agentabb, String agentadd,
      String agentzip, String agenttel, String agentfax, String citycd,
      String manager, String sales, String email, String areaId,
      String remarks, String opKey, Integer opUser, Date opDate,
      String webKey, BigDecimal arrearage, String warnKey,
      BigDecimal payment, String reckoning, String agentType,
      String bussTime, String comeandgo, String gmTel, String gmTalk,
      String phoneFile1, String mapFile, String phoneFile2, Integer createUser,
      Date createDate, String checkKey) {
    this.branchId = branchId;
    this.agentnm = agentnm;
    this.agentabb = agentabb;
    this.agentadd = agentadd;
    this.agentzip = agentzip;
    this.agenttel = agenttel;
    this.agentfax = agentfax;
    this.citycd = citycd;
    this.manager = manager;
    this.sales = sales;
    this.email = email;
    this.areaId = areaId;
    this.remarks = remarks;
    this.opKey = opKey;
    this.opUser = opUser;
    this.opDate = opDate;
    this.webKey = webKey;
    this.arrearage = arrearage;
    this.warnKey = warnKey;
    this.payment = payment;
    this.reckoning = reckoning;
    this.agentType = agentType;
    this.bussTime = bussTime;
    this.comeandgo = comeandgo;
    this.gmTel = gmTel;
    this.gmTalk = gmTalk;
    this.phoneFile1 = phoneFile1;
    this.mapFile = mapFile;
    this.phoneFile2 = phoneFile2;
    this.createUser = createUser;
    this.createDate = createDate;
    this.checkKey = checkKey;
  }

  @Id
  @Column(name = "BRANCH_ID", unique = true, nullable = false)
  public int getBranchId() {
    return this.branchId;
  }

  public void setBranchId(int branchId) {
    this.branchId = branchId;
  }

  @Column(name = "AGENTNM", nullable = false, length = 40)
  public String getAgentnm() {
    return this.agentnm;
  }

  public void setAgentnm(String agentnm) {
    this.agentnm = agentnm;
  }

  @Column(name = "AGENTABB", nullable = false, length = 10)
  public String getAgentabb() {
    return this.agentabb;
  }

  public void setAgentabb(String agentabb) {
    this.agentabb = agentabb;
  }

  @Column(name = "AGENTADD", nullable = false, length = 40)
  public String getAgentadd() {
    return this.agentadd;
  }

  public void setAgentadd(String agentadd) {
    this.agentadd = agentadd;
  }

  @Column(name = "AGENTZIP", nullable = false, length = 6)
  public String getAgentzip() {
    return this.agentzip;
  }

  public void setAgentzip(String agentzip) {
    this.agentzip = agentzip;
  }

  @Column(name = "AGENTTEL", nullable = false, length = 30)
  public String getAgenttel() {
    return this.agenttel;
  }

  public void setAgenttel(String agenttel) {
    this.agenttel = agenttel;
  }

  @Column(name = "AGENTFAX", nullable = false, length = 30)
  public String getAgentfax() {
    return this.agentfax;
  }

  public void setAgentfax(String agentfax) {
    this.agentfax = agentfax;
  }

  @Column(name = "CITYCD", nullable = false, length = 3)
  public String getCitycd() {
    return this.citycd;
  }

  public void setCitycd(String citycd) {
    this.citycd = citycd;
  }

  @Column(name = "MANAGER", nullable = false, length = 8)
  public String getManager() {
    return this.manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  @Column(name = "SALES", nullable = false, length = 20)
  public String getSales() {
    return this.sales;
  }

  public void setSales(String sales) {
    this.sales = sales;
  }

  @Column(name = "EMAIL", length = 50)
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "AREA_ID", length = 4)
  public String getAreaId() {
    return this.areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

  @Column(name = "REMARKS", length = 256)
  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @Column(name = "OP_KEY", length = 1)
  public String getOpKey() {
    return this.opKey;
  }

  public void setOpKey(String opKey) {
    this.opKey = opKey;
  }

  @Column(name = "OP_USER")
  public Integer getOpUser() {
    return this.opUser;
  }

  public void setOpUser(Integer opUser) {
    this.opUser = opUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OP_DATE", nullable = false, length = 19)
  public Date getOpDate() {
    return this.opDate;
  }

  public void setOpDate(Date opDate) {
    this.opDate = opDate;
  }

  @Column(name = "WEB_KEY", length = 10)
  public String getWebKey() {
    return this.webKey;
  }

  public void setWebKey(String webKey) {
    this.webKey = webKey;
  }

  @Column(name = "ARREARAGE", precision = 10)
  public BigDecimal getArrearage() {
    return this.arrearage;
  }

  public void setArrearage(BigDecimal arrearage) {
    this.arrearage = arrearage;
  }

  @Column(name = "WARN_KEY", length = 1)
  public String getWarnKey() {
    return this.warnKey;
  }

  public void setWarnKey(String warnKey) {
    this.warnKey = warnKey;
  }

  @Column(name = "PAYMENT", precision = 10)
  public BigDecimal getPayment() {
    return this.payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

  @Column(name = "RECKONING", length = 1)
  public String getReckoning() {
    return this.reckoning;
  }

  public void setReckoning(String reckoning) {
    this.reckoning = reckoning;
  }

  @Column(name = "AGENT_TYPE", length = 1)
  public String getAgentType() {
    return this.agentType;
  }

  public void setAgentType(String agentType) {
    this.agentType = agentType;
  }

  @Column(name = "BUSS_TIME", length = 50)
  public String getBussTime() {
    return this.bussTime;
  }

  public void setBussTime(String bussTime) {
    this.bussTime = bussTime;
  }

  @Column(name = "COMEANDGO", length = 500)
  public String getComeandgo() {
    return this.comeandgo;
  }

  public void setComeandgo(String comeandgo) {
    this.comeandgo = comeandgo;
  }

  @Column(name = "GM_TEL", length = 200)
  public String getGmTel() {
    return this.gmTel;
  }

  public void setGmTel(String gmTel) {
    this.gmTel = gmTel;
  }

  @Column(name = "GM_TALK", length = 1000)
  public String getGmTalk() {
    return this.gmTalk;
  }

  public void setGmTalk(String gmTalk) {
    this.gmTalk = gmTalk;
  }

  @Column(name = "PHONE_FILE1", length = 200)
  public String getPhoneFile1() {
    return this.phoneFile1;
  }

  public void setPhoneFile1(String phoneFile1) {
    this.phoneFile1 = phoneFile1;
  }

  @Column(name = "MAP_FILE", length = 200)
  public String getMapFile() {
    return this.mapFile;
  }

  public void setMapFile(String mapFile) {
    this.mapFile = mapFile;
  }

  @Column(name = "PHONE_FILE2", length = 200)
  public String getPhoneFile2() {
    return this.phoneFile2;
  }

  public void setPhoneFile2(String phoneFile2) {
    this.phoneFile2 = phoneFile2;
  }

  @Column(name = "CREATE_USER")
  public Integer getCreateUser() {
    return this.createUser;
  }

  public void setCreateUser(Integer createUser) {
    this.createUser = createUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CREATE_DATE", length = 19)
  public Date getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Column(name = "CHECK_KEY", length = 1)
  public String getCheckKey() {
    return this.checkKey;
  }

  public void setCheckKey(String checkKey) {
    this.checkKey = checkKey;
  }

  /** 交通 */
  private String comeAndGo;

  /** 营业时间 */
  private String officeHours;

  /** 店长电话 */
  private String shopkeeperPhone;

  /** 店长寄语 */
  private String shopkeeperSaying;

  /** 店长照片文件 */
  private String shopkeeperPhoneFile;

  /** 门店照片文件 */
  private String branchPhoneFile;

  @Transient
  public String getComeAndGo() {
    return comeAndGo;
  }

  public void setComeAndGo(String comeAndGo) {
    this.comeAndGo = comeAndGo;
  }

  @Transient
  public String getOfficeHours() {
    return officeHours;
  }

  public void setOfficeHours(String officeHours) {
    this.officeHours = officeHours;
  }

  /**
   * 店长
   * 
   * @return
   */
  @Transient
  public String getShopkeeper() {
    return getManager();
  }

  public void setShopkeeper(String keeper) {
    setManager(keeper);
  }

  @Transient
  public String getShopkeeperPhone() {
    return shopkeeperPhone;
  }

  public void setShopkeeperPhone(String shopkeeperPhone) {
    this.shopkeeperPhone = shopkeeperPhone;
  }

  @Transient
  public String getShopkeeperSaying() {
    return shopkeeperSaying;
  }

  public void setShopkeeperSaying(String shopkeeperSaying) {
    this.shopkeeperSaying = shopkeeperSaying;
  }

  @Transient
  public String getBranchPhoneFile() {
    return branchPhoneFile;
  }

  public void setBranchPhoneFile(String branchPhoneFile) {
    this.branchPhoneFile = branchPhoneFile;
  }

  @Transient
  public String getShopkeeperPhoneFile() {
    return shopkeeperPhoneFile;
  }

  public void setShopkeeperPhoneFile(String shopkeeperPhoneFile) {
    this.shopkeeperPhoneFile = shopkeeperPhoneFile;
  }

}
