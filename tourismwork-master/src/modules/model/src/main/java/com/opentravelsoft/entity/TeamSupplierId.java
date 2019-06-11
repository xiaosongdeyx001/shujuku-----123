package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TeamSupplierId implements java.io.Serializable {

  private int customerId;
  private int teamId;

  public TeamSupplierId() {
  }

  public TeamSupplierId(int customerId, int teamId) {
    this.customerId = customerId;
    this.teamId = teamId;
  }

  @Column(name = "CUSTOMER_ID", nullable = false)
  public int getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  @Column(name = "TEAM_ID", nullable = false)
  public int getTeamId() {
    return this.teamId;
  }

  public void setTeamId(int teamId) {
    this.teamId = teamId;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof TeamSupplierId))
      return false;
    TeamSupplierId castOther = (TeamSupplierId) other;

    return (this.getCustomerId() == castOther.getCustomerId())
        && (this.getTeamId() == castOther.getTeamId());
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + this.getCustomerId();
    result = 37 * result + this.getTeamId();
    return result;
  }
}
