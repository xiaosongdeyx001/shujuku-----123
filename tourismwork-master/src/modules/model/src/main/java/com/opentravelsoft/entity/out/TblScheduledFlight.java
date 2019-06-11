package com.opentravelsoft.entity.out;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_scheduled_flight")
public class TblScheduledFlight implements java.io.Serializable {

  private String recNo;
  private String fromCity;
  private String fromCityAirport;
  private String toCity;
  private String toCityAirport;
  private String flightNoSix;
  private String flightNoFour;
  private String airlineCompany;
  private String weekbit;
  private Date fromTime;
  private Date toTime;
  private Integer stayNight;
  private Integer stopStation;
  private String airplaneModel;
  private Date startDate;
  private Date endDate;

  public TblScheduledFlight() {
  }

  public TblScheduledFlight(String recNo) {
    this.recNo = recNo;
  }

  public TblScheduledFlight(String recNo, String fromCity,
      String fromCityAirport, String toCity, String toCityAirport,
      String flightNoSix, String flightNoFour, String airlineCompany,
      String weekbit, Date fromTime, Date toTime, Integer stayNight,
      Integer stopStation, String airplaneModel, Date startDate, Date endDate) {
    this.recNo = recNo;
    this.fromCity = fromCity;
    this.fromCityAirport = fromCityAirport;
    this.toCity = toCity;
    this.toCityAirport = toCityAirport;
    this.flightNoSix = flightNoSix;
    this.flightNoFour = flightNoFour;
    this.airlineCompany = airlineCompany;
    this.weekbit = weekbit;
    this.fromTime = fromTime;
    this.toTime = toTime;
    this.stayNight = stayNight;
    this.stopStation = stopStation;
    this.airplaneModel = airplaneModel;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  @Id
  @Column(name = "REC_NO", unique = true, nullable = false, length = 10)
  public String getRecNo() {
    return this.recNo;
  }

  public void setRecNo(String recNo) {
    this.recNo = recNo;
  }

  @Column(name = "FROM_CITY", length = 4)
  public String getFromCity() {
    return this.fromCity;
  }

  public void setFromCity(String fromCity) {
    this.fromCity = fromCity;
  }

  @Column(name = "FROM_CITY_AIRPORT", length = 4)
  public String getFromCityAirport() {
    return this.fromCityAirport;
  }

  public void setFromCityAirport(String fromCityAirport) {
    this.fromCityAirport = fromCityAirport;
  }

  @Column(name = "TO_CITY", length = 4)
  public String getToCity() {
    return this.toCity;
  }

  public void setToCity(String toCity) {
    this.toCity = toCity;
  }

  @Column(name = "TO_CITY_AIRPORT", length = 4)
  public String getToCityAirport() {
    return this.toCityAirport;
  }

  public void setToCityAirport(String toCityAirport) {
    this.toCityAirport = toCityAirport;
  }

  @Column(name = "FLIGHT_NO_SIX", length = 6)
  public String getFlightNoSix() {
    return this.flightNoSix;
  }

  public void setFlightNoSix(String flightNoSix) {
    this.flightNoSix = flightNoSix;
  }

  @Column(name = "FLIGHT_NO_FOUR", length = 4)
  public String getFlightNoFour() {
    return this.flightNoFour;
  }

  public void setFlightNoFour(String flightNoFour) {
    this.flightNoFour = flightNoFour;
  }

  @Column(name = "AIRLINE_COMPANY", length = 2)
  public String getAirlineCompany() {
    return this.airlineCompany;
  }

  public void setAirlineCompany(String airlineCompany) {
    this.airlineCompany = airlineCompany;
  }

  @Column(name = "WEEKBIT", length = 7)
  public String getWeekbit() {
    return this.weekbit;
  }

  public void setWeekbit(String weekbit) {
    this.weekbit = weekbit;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "FROM_TIME", length = 19)
  public Date getFromTime() {
    return this.fromTime;
  }

  public void setFromTime(Date fromTime) {
    this.fromTime = fromTime;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "TO_TIME", length = 19)
  public Date getToTime() {
    return this.toTime;
  }

  public void setToTime(Date toTime) {
    this.toTime = toTime;
  }

  @Column(name = "STAY_NIGHT")
  public Integer getStayNight() {
    return this.stayNight;
  }

  public void setStayNight(Integer stayNight) {
    this.stayNight = stayNight;
  }

  @Column(name = "STOP_STATION")
  public Integer getStopStation() {
    return this.stopStation;
  }

  public void setStopStation(Integer stopStation) {
    this.stopStation = stopStation;
  }

  @Column(name = "AIRPLANE_MODEL", length = 12)
  public String getAirplaneModel() {
    return this.airplaneModel;
  }

  public void setAirplaneModel(String airplaneModel) {
    this.airplaneModel = airplaneModel;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "START_DATE", length = 19)
  public Date getStartDate() {
    return this.startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "END_DATE", length = 19)
  public Date getEndDate() {
    return this.endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

}
