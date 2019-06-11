package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SequenceId implements java.io.Serializable {

  private String rectype;
  private String year;
  private String month;

  public SequenceId() {
  }

  public SequenceId(String rectype, String year, String month) {
    this.rectype = rectype;
    this.year = year;
    this.month = month;
  }

  @Column(name = "RECTYPE", nullable = false, length = 1)
  public String getRectype() {
    return this.rectype;
  }

  public void setRectype(String rectype) {
    this.rectype = rectype;
  }

  @Column(name = "YEAR", nullable = false, length = 4)
  public String getYear() {
    return this.year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  @Column(name = "MONTH", nullable = false, length = 2)
  public String getMonth() {
    return this.month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof SequenceId))
      return false;
    SequenceId castOther = (SequenceId) other;

    return ((this.getRectype() == castOther.getRectype()) || (this.getRectype() != null
        && castOther.getRectype() != null && this.getRectype().equals(
        castOther.getRectype())))
        && ((this.getYear() == castOther.getYear()) || (this.getYear() != null
            && castOther.getYear() != null && this.getYear().equals(
            castOther.getYear())))
        && ((this.getMonth() == castOther.getMonth()) || (this.getMonth() != null
            && castOther.getMonth() != null && this.getMonth().equals(
            castOther.getMonth())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result
        + (getRectype() == null ? 0 : this.getRectype().hashCode());
    result = 37 * result + (getYear() == null ? 0 : this.getYear().hashCode());
    result = 37 * result
        + (getMonth() == null ? 0 : this.getMonth().hashCode());
    return result;
  }

}
