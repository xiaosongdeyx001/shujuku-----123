package com.opentravelsoft.entity.out;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_outcome_acct")
public class TblOutcomeAcct implements java.io.Serializable {

  private Integer outcomeAcctId;
  private int outcomeId;
  private int acctId;
  private String tourNo;
  private BigDecimal opRoe;
  private String currency;
  private BigDecimal fcAmount;
  private BigDecimal roe;
  private BigDecimal amount;
  private String note;
  private String planNo;

  public TblOutcomeAcct() {
  }

  public TblOutcomeAcct(int outcomeId, int acctId) {
    this.outcomeId = outcomeId;
    this.acctId = acctId;
  }

  public TblOutcomeAcct(int outcomeId, int acctId, String tourNo,
      BigDecimal opRoe, String currency, BigDecimal fcAmount, BigDecimal roe,
      BigDecimal amount, String note, String planNo) {
    this.outcomeId = outcomeId;
    this.acctId = acctId;
    this.tourNo = tourNo;
    this.opRoe = opRoe;
    this.currency = currency;
    this.fcAmount = fcAmount;
    this.roe = roe;
    this.amount = amount;
    this.note = note;
    this.planNo = planNo;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "OUTCOME_ACCT_ID", unique = true, nullable = false)
  public Integer getOutcomeAcctId() {
    return this.outcomeAcctId;
  }

  public void setOutcomeAcctId(Integer outcomeAcctId) {
    this.outcomeAcctId = outcomeAcctId;
  }

  @Column(name = "OUTCOME_ID", nullable = false)
  public int getOutcomeId() {
    return this.outcomeId;
  }

  public void setOutcomeId(int outcomeId) {
    this.outcomeId = outcomeId;
  }

  @Column(name = "ACCT_ID", nullable = false)
  public int getAcctId() {
    return this.acctId;
  }

  public void setAcctId(int acctId) {
    this.acctId = acctId;
  }

  @Column(name = "TOUR_NO", length = 100)
  public String getTourNo() {
    return this.tourNo;
  }

  public void setTourNo(String tourNo) {
    this.tourNo = tourNo;
  }

  @Column(name = "OP_ROE", precision = 9, scale = 4)
  public BigDecimal getOpRoe() {
    return this.opRoe;
  }

  public void setOpRoe(BigDecimal opRoe) {
    this.opRoe = opRoe;
  }

  @Column(name = "CURRENCY", length = 4)
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Column(name = "FC_AMOUNT", precision = 9)
  public BigDecimal getFcAmount() {
    return this.fcAmount;
  }

  public void setFcAmount(BigDecimal fcAmount) {
    this.fcAmount = fcAmount;
  }

  @Column(name = "ROE", precision = 9, scale = 4)
  public BigDecimal getRoe() {
    return this.roe;
  }

  public void setRoe(BigDecimal roe) {
    this.roe = roe;
  }

  @Column(name = "AMOUNT", precision = 10)
  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  @Column(name = "NOTE", length = 100)
  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Column(name = "PLAN_NO", length = 20)
  public String getPlanNo() {
    return this.planNo;
  }

  public void setPlanNo(String planNo) {
    this.planNo = planNo;
  }

}
