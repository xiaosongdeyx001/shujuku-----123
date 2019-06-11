package com.opentravelsoft.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_share_flight")
public class ShareFlight implements java.io.Serializable {

  private Integer shareFlightId;
  private String flightNo;
  private String airwaysCode;
  private Date departureDate;
  private Integer seating;
  private Integer handle;
  private String note;

  public ShareFlight() {
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "SHARE_FLIGHT_ID", unique = true, nullable = false)
  public Integer getShareFlightId() {
    return this.shareFlightId;
  }

  public void setShareFlightId(Integer shareFlightId) {
    this.shareFlightId = shareFlightId;
  }

  @Column(name = "FLIGHT_NO", nullable = false, length = 10)
  public String getFlightNo() {
    return this.flightNo;
  }

  public void setFlightNo(String flightNo) {
    this.flightNo = flightNo;
  }

  @Column(name = "AIRWAYS_CODE", length = 4)
  public String getAirwaysCode() {
    return this.airwaysCode;
  }

  public void setAirwaysCode(String airwaysCode) {
    this.airwaysCode = airwaysCode;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "DEPARTURE_DATE", nullable = false, length = 19)
  public Date getDepartureDate() {
    return this.departureDate;
  }

  public void setDepartureDate(Date departureDate) {
    this.departureDate = departureDate;
  }

  @Column(name = "SEATING")
  public Integer getSeating() {
    return this.seating;
  }

  public void setSeating(Integer seating) {
    this.seating = seating;
  }

  @Column(name = "HANDLE")
  public Integer getHandle() {
    return this.handle;
  }

  public void setHandle(Integer handle) {
    this.handle = handle;
  }

  @Column(name = "NOTE", length = 100)
  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  private String airwaysName;

  @Transient
  public String getAirwaysName() {
    return airwaysName;
  }

  public void setAirwaysName(String airwaysName) {
    this.airwaysName = airwaysName;
  }

}
