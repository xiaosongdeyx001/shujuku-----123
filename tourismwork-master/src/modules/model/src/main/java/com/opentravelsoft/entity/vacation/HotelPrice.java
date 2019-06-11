package com.opentravelsoft.entity.vacation;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 酒店房价表
 */
@Entity
@Table(name = "tbl_hotel_price")
public class HotelPrice implements java.io.Serializable {

  private String recNo;
  private String hotId;
  private String roomType;
  private BigDecimal prcAmt01;
  private BigDecimal prcAmt02;
  private BigDecimal prcAmt03;
  private String prcRem1;
  private String prcRem2;
  private String foodType;
  private String apFlag;
  private Integer recommend;
  private Integer apNight;
  private Date SDate;
  private Date EDate;
  private String weekbit;
  private Byte isDelete;
  private String crUser;
  private Date crDate;
  private String opUser;
  private Date opDate;
  private String airCo;
  private BigDecimal industry;
  private BigDecimal bnRate1;
  private BigDecimal bnAmount1;
  private BigDecimal bnRate2;
  private BigDecimal bnAmount2;
  private BigDecimal bnRate3;
  private BigDecimal bnAmount3;
  private BigDecimal bnRate;
  private BigDecimal bnAmount;
  private String opKey;
  private String checkKey;
  private String checkUser;
  private Date checkDate;

  public HotelPrice() {
  }

  public HotelPrice(String recNo) {
    this.recNo = recNo;
  }

  @Id
  @Column(name = "REC_NO", unique = true, nullable = false, length = 10)
  public String getRecNo() {
    return this.recNo;
  }

  public void setRecNo(String recNo) {
    this.recNo = recNo;
  }

  @Column(name = "HOT_ID", length = 10)
  public String getHotId() {
    return this.hotId;
  }

  public void setHotId(String hotId) {
    this.hotId = hotId;
  }

  @Column(name = "ROOM_TYPE", length = 10)
  public String getRoomType() {
    return this.roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }

  @Column(name = "PRC_AMT01", precision = 9)
  public BigDecimal getPrcAmt01() {
    return this.prcAmt01;
  }

  public void setPrcAmt01(BigDecimal prcAmt01) {
    this.prcAmt01 = prcAmt01;
  }

  @Column(name = "PRC_AMT02", precision = 9)
  public BigDecimal getPrcAmt02() {
    return this.prcAmt02;
  }

  public void setPrcAmt02(BigDecimal prcAmt02) {
    this.prcAmt02 = prcAmt02;
  }

  @Column(name = "PRC_AMT03", precision = 9)
  public BigDecimal getPrcAmt03() {
    return this.prcAmt03;
  }

  public void setPrcAmt03(BigDecimal prcAmt03) {
    this.prcAmt03 = prcAmt03;
  }

  @Column(name = "PRC_REM1", length = 1000)
  public String getPrcRem1() {
    return this.prcRem1;
  }

  public void setPrcRem1(String prcRem1) {
    this.prcRem1 = prcRem1;
  }

  @Column(name = "PRC_REM2", length = 1000)
  public String getPrcRem2() {
    return this.prcRem2;
  }

  public void setPrcRem2(String prcRem2) {
    this.prcRem2 = prcRem2;
  }

  @Column(name = "FOOD_TYPE", length = 2)
  public String getFoodType() {
    return this.foodType;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }

  @Column(name = "AP_FLAG", length = 1)
  public String getApFlag() {
    return this.apFlag;
  }

  public void setApFlag(String apFlag) {
    this.apFlag = apFlag;
  }

  @Column(name = "RECOMMEND")
  public Integer getRecommend() {
    return this.recommend;
  }

  public void setRecommend(Integer recommend) {
    this.recommend = recommend;
  }

  @Column(name = "AP_NIGHT")
  public Integer getApNight() {
    return this.apNight;
  }

  public void setApNight(Integer apNight) {
    this.apNight = apNight;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "S_DATE", length = 19)
  public Date getSDate() {
    return this.SDate;
  }

  public void setSDate(Date SDate) {
    this.SDate = SDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "E_DATE", length = 19)
  public Date getEDate() {
    return this.EDate;
  }

  public void setEDate(Date EDate) {
    this.EDate = EDate;
  }

  @Column(name = "WEEKBIT", length = 20)
  public String getWeekbit() {
    return this.weekbit;
  }

  public void setWeekbit(String weekbit) {
    this.weekbit = weekbit;
  }

  @Column(name = "IS_DELETE")
  public Byte getIsDelete() {
    return this.isDelete;
  }

  public void setIsDelete(Byte isDelete) {
    this.isDelete = isDelete;
  }

  @Column(name = "CR_USER", length = 50)
  public String getCrUser() {
    return this.crUser;
  }

  public void setCrUser(String crUser) {
    this.crUser = crUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CR_DATE", length = 19)
  public Date getCrDate() {
    return this.crDate;
  }

  public void setCrDate(Date crDate) {
    this.crDate = crDate;
  }

  @Column(name = "OP_USER", length = 50)
  public String getOpUser() {
    return this.opUser;
  }

  public void setOpUser(String opUser) {
    this.opUser = opUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OP_DATE", length = 19)
  public Date getOpDate() {
    return this.opDate;
  }

  public void setOpDate(Date opDate) {
    this.opDate = opDate;
  }

  @Column(name = "AIR_CO", length = 10)
  public String getAirCo() {
    return this.airCo;
  }

  public void setAirCo(String airCo) {
    this.airCo = airCo;
  }

  @Column(name = "INDUSTRY", precision = 9)
  public BigDecimal getIndustry() {
    return this.industry;
  }

  public void setIndustry(BigDecimal industry) {
    this.industry = industry;
  }

  @Column(name = "BN_RATE1", precision = 6)
  public BigDecimal getBnRate1() {
    return this.bnRate1;
  }

  public void setBnRate1(BigDecimal bnRate1) {
    this.bnRate1 = bnRate1;
  }

  @Column(name = "BN_AMOUNT1", precision = 9)
  public BigDecimal getBnAmount1() {
    return this.bnAmount1;
  }

  public void setBnAmount1(BigDecimal bnAmount1) {
    this.bnAmount1 = bnAmount1;
  }

  @Column(name = "BN_RATE2", precision = 6)
  public BigDecimal getBnRate2() {
    return this.bnRate2;
  }

  public void setBnRate2(BigDecimal bnRate2) {
    this.bnRate2 = bnRate2;
  }

  @Column(name = "BN_AMOUNT2", precision = 9)
  public BigDecimal getBnAmount2() {
    return this.bnAmount2;
  }

  public void setBnAmount2(BigDecimal bnAmount2) {
    this.bnAmount2 = bnAmount2;
  }

  @Column(name = "BN_RATE3", precision = 6)
  public BigDecimal getBnRate3() {
    return this.bnRate3;
  }

  public void setBnRate3(BigDecimal bnRate3) {
    this.bnRate3 = bnRate3;
  }

  @Column(name = "BN_AMOUNT3", precision = 9)
  public BigDecimal getBnAmount3() {
    return this.bnAmount3;
  }

  public void setBnAmount3(BigDecimal bnAmount3) {
    this.bnAmount3 = bnAmount3;
  }

  @Column(name = "BN_RATE", precision = 6)
  public BigDecimal getBnRate() {
    return this.bnRate;
  }

  public void setBnRate(BigDecimal bnRate) {
    this.bnRate = bnRate;
  }

  @Column(name = "BN_AMOUNT", precision = 9)
  public BigDecimal getBnAmount() {
    return this.bnAmount;
  }

  public void setBnAmount(BigDecimal bnAmount) {
    this.bnAmount = bnAmount;
  }

  @Column(name = "OP_KEY", length = 1)
  public String getOpKey() {
    return this.opKey;
  }

  public void setOpKey(String opKey) {
    this.opKey = opKey;
  }

  @Column(name = "CHECK_KEY", length = 1)
  public String getCheckKey() {
    return this.checkKey;
  }

  public void setCheckKey(String checkKey) {
    this.checkKey = checkKey;
  }

  @Column(name = "CHECK_USER", length = 8)
  public String getCheckUser() {
    return this.checkUser;
  }

  public void setCheckUser(String checkUser) {
    this.checkUser = checkUser;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "CHECK_DATE", length = 19)
  public Date getCheckDate() {
    return this.checkDate;
  }

  public void setCheckDate(Date checkDate) {
    this.checkDate = checkDate;
  }

}
