package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TblLineSightsId implements java.io.Serializable {

  private String lineNo;
  private String sightNo;

  public TblLineSightsId() {
  }

  public TblLineSightsId(String lineNo, String sightNo) {
    this.lineNo = lineNo;
    this.sightNo = sightNo;
  }

  @Column(name = "LINE_NO", nullable = false, length = 10)
  public String getLineNo() {
    return this.lineNo;
  }

  public void setLineNo(String lineNo) {
    this.lineNo = lineNo;
  }

  @Column(name = "SIGHT_NO", nullable = false, length = 10)
  public String getSightNo() {
    return this.sightNo;
  }

  public void setSightNo(String sightNo) {
    this.sightNo = sightNo;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof TblLineSightsId))
      return false;
    TblLineSightsId castOther = (TblLineSightsId) other;

    return ((this.getLineNo() == castOther.getLineNo()) || (this.getLineNo() != null
        && castOther.getLineNo() != null && this.getLineNo().equals(
        castOther.getLineNo())))
        && ((this.getSightNo() == castOther.getSightNo()) || (this.getSightNo() != null
            && castOther.getSightNo() != null && this.getSightNo().equals(
            castOther.getSightNo())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result
        + (getLineNo() == null ? 0 : this.getLineNo().hashCode());
    result = 37 * result
        + (getSightNo() == null ? 0 : this.getSightNo().hashCode());
    return result;
  }

}
