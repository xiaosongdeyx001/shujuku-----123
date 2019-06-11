package com.opentravelsoft.entity.vacation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "tbl_flightgroup")
public class FlightGroup implements java.io.Serializable {

  private String flightGroupId;
  private String flightPlanId;
  private String flightId1;
  private String flightNo1;
  private String flightId2;
  private String flightNo2;
  private String flightId3;
  private String flightNo3;
  private String flightId4;
  private String flightNo4;
  private String flightId5;
  private String flightNo5;
  private String flightId6;
  private String flightNo6;
  private boolean isDeleted;

  public FlightGroup() {
  }

  public FlightGroup(String flightGroupId, String flightPlanId,
      boolean isDeleted) {
    this.flightGroupId = flightGroupId;
    this.flightPlanId = flightPlanId;
    this.isDeleted = isDeleted;
  }

  public FlightGroup(String flightGroupId, String flightPlanId,
      String flightId1, String flightNo1, String flightId2, String flightNo2,
      String flightId3, String flightNo3, String flightId4, String flightNo4,
      String flightId5, String flightNo5, String flightId6, String flightNo6,
      boolean isDeleted) {
    this.flightGroupId = flightGroupId;
    this.flightPlanId = flightPlanId;
    this.flightId1 = flightId1;
    this.flightNo1 = flightNo1;
    this.flightId2 = flightId2;
    this.flightNo2 = flightNo2;
    this.flightId3 = flightId3;
    this.flightNo3 = flightNo3;
    this.flightId4 = flightId4;
    this.flightNo4 = flightNo4;
    this.flightId5 = flightId5;
    this.flightNo5 = flightNo5;
    this.flightId6 = flightId6;
    this.flightNo6 = flightNo6;
    this.isDeleted = isDeleted;
  }

  @Id
  @Column(name = "FlightGroupID", unique = true, nullable = false, length = 36)
  public String getFlightGroupId() {
    return this.flightGroupId;
  }

  public void setFlightGroupId(String flightGroupId) {
    this.flightGroupId = flightGroupId;
  }

  @Column(name = "FlightPlanID", nullable = false, length = 36)
  public String getFlightPlanId() {
    return this.flightPlanId;
  }

  public void setFlightPlanId(String flightPlanId) {
    this.flightPlanId = flightPlanId;
  }

  @Column(name = "FlightID1", length = 10)
  public String getFlightId1() {
    return this.flightId1;
  }

  public void setFlightId1(String flightId1) {
    this.flightId1 = flightId1;
  }

  @Column(name = "FlightNo1", length = 20)
  public String getFlightNo1() {
    return this.flightNo1;
  }

  public void setFlightNo1(String flightNo1) {
    this.flightNo1 = flightNo1;
  }

  @Column(name = "FlightID2", length = 10)
  public String getFlightId2() {
    return this.flightId2;
  }

  public void setFlightId2(String flightId2) {
    this.flightId2 = flightId2;
  }

  @Column(name = "FlightNo2", length = 20)
  public String getFlightNo2() {
    return this.flightNo2;
  }

  public void setFlightNo2(String flightNo2) {
    this.flightNo2 = flightNo2;
  }

  @Column(name = "FlightID3", length = 10)
  public String getFlightId3() {
    return this.flightId3;
  }

  public void setFlightId3(String flightId3) {
    this.flightId3 = flightId3;
  }

  @Column(name = "FlightNo3", length = 20)
  public String getFlightNo3() {
    return this.flightNo3;
  }

  public void setFlightNo3(String flightNo3) {
    this.flightNo3 = flightNo3;
  }

  @Column(name = "FlightID4", length = 10)
  public String getFlightId4() {
    return this.flightId4;
  }

  public void setFlightId4(String flightId4) {
    this.flightId4 = flightId4;
  }

  @Column(name = "FlightNo4", length = 20)
  public String getFlightNo4() {
    return this.flightNo4;
  }

  public void setFlightNo4(String flightNo4) {
    this.flightNo4 = flightNo4;
  }

  @Column(name = "FlightID5", length = 10)
  public String getFlightId5() {
    return this.flightId5;
  }

  public void setFlightId5(String flightId5) {
    this.flightId5 = flightId5;
  }

  @Column(name = "FlightNo5", length = 20)
  public String getFlightNo5() {
    return this.flightNo5;
  }

  public void setFlightNo5(String flightNo5) {
    this.flightNo5 = flightNo5;
  }

  @Column(name = "FlightID6", length = 10)
  public String getFlightId6() {
    return this.flightId6;
  }

  public void setFlightId6(String flightId6) {
    this.flightId6 = flightId6;
  }

  @Column(name = "FlightNo6", length = 20)
  public String getFlightNo6() {
    return this.flightNo6;
  }

  public void setFlightNo6(String flightNo6) {
    this.flightNo6 = flightNo6;
  }

  @Column(name = "IsDeleted", nullable = false)
  public boolean isIsDeleted() {
    return this.isDeleted;
  }

  public void setIsDeleted(boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

}
