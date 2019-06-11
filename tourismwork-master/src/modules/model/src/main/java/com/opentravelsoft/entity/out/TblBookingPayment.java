package com.opentravelsoft.entity.out;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_booking_payment")
public class TblBookingPayment implements java.io.Serializable {

  private Integer id;
  private String orderNo;
  private String bookingNo;
  private String payType;
  private String type;
  private BigDecimal amount;
  private Date schedule;
  private String result;
  private String remarks;

  public TblBookingPayment() {
  }

  public TblBookingPayment(String bookingNo, String payType) {
    this.bookingNo = bookingNo;
    this.payType = payType;
  }

  public TblBookingPayment(String orderNo, String bookingNo, String payType,
      String type, BigDecimal amount, Date schedule, String result,
      String remarks) {
    this.orderNo = orderNo;
    this.bookingNo = bookingNo;
    this.payType = payType;
    this.type = type;
    this.amount = amount;
    this.schedule = schedule;
    this.result = result;
    this.remarks = remarks;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "ID", unique = true, nullable = false)
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "ORDER_NO", length = 20)
  public String getOrderNo() {
    return this.orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  @Column(name = "BOOKING_NO", nullable = false, length = 20)
  public String getBookingNo() {
    return this.bookingNo;
  }

  public void setBookingNo(String bookingNo) {
    this.bookingNo = bookingNo;
  }

  @Column(name = "PAY_TYPE", nullable = false, length = 10)
  public String getPayType() {
    return this.payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }

  @Column(name = "TYPE", length = 3)
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Column(name = "AMOUNT", precision = 9)
  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "SCHEDULE", length = 19)
  public Date getSchedule() {
    return this.schedule;
  }

  public void setSchedule(Date schedule) {
    this.schedule = schedule;
  }

  @Column(name = "RESULT", length = 10)
  public String getResult() {
    return this.result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  @Column(name = "REMARKS", length = 1000)
  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
