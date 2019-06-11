package com.opentravelsoft.entity.out;

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
@Table(name = "tbl_log")
public class TblLog implements java.io.Serializable {

  private Integer id;
  private String classtype;
  private String dptNo;
  private String operator;
  private String routeNo;
  private String routeName;
  private String planNo;
  private Date outDate;
  private String bookingNo;
  private String info;
  private Date modifiedDate;

  public TblLog() {
  }

  public TblLog(String classtype, String dptNo, String operator,
      String routeNo, String routeName, String planNo, Date outDate,
      String bookingNo, String info, Date modifiedDate) {
    this.classtype = classtype;
    this.dptNo = dptNo;
    this.operator = operator;
    this.routeNo = routeNo;
    this.routeName = routeName;
    this.planNo = planNo;
    this.outDate = outDate;
    this.bookingNo = bookingNo;
    this.info = info;
    this.modifiedDate = modifiedDate;
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

  @Column(name = "CLASSTYPE", length = 1)
  public String getClasstype() {
    return this.classtype;
  }

  public void setClasstype(String classtype) {
    this.classtype = classtype;
  }

  @Column(name = "DPT_NO", length = 8)
  public String getDptNo() {
    return this.dptNo;
  }

  public void setDptNo(String dptNo) {
    this.dptNo = dptNo;
  }

  @Column(name = "OPERATOR", length = 10)
  public String getOperator() {
    return this.operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  @Column(name = "ROUTE_NO", length = 10)
  public String getRouteNo() {
    return this.routeNo;
  }

  public void setRouteNo(String routeNo) {
    this.routeNo = routeNo;
  }

  @Column(name = "ROUTE_NAME", length = 50)
  public String getRouteName() {
    return this.routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  @Column(name = "PLAN_NO", length = 10)
  public String getPlanNo() {
    return this.planNo;
  }

  public void setPlanNo(String planNo) {
    this.planNo = planNo;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "OUT_DATE", length = 19)
  public Date getOutDate() {
    return this.outDate;
  }

  public void setOutDate(Date outDate) {
    this.outDate = outDate;
  }

  @Column(name = "BOOKING_NO", length = 12)
  public String getBookingNo() {
    return this.bookingNo;
  }

  public void setBookingNo(String bookingNo) {
    this.bookingNo = bookingNo;
  }

  @Column(name = "INFO", length = 1000)
  public String getInfo() {
    return this.info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "MODIFIED_DATE", length = 19)
  public Date getModifiedDate() {
    return this.modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

}
