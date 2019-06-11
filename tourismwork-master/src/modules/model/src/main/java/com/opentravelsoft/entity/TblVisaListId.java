package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TblVisaListId implements java.io.Serializable {

  private String nmno;
  private int applyId;

  public TblVisaListId() {
  }

  public TblVisaListId(String nmno, int applyId) {
    this.nmno = nmno;
    this.applyId = applyId;
  }

  @Column(name = "NMNO", nullable = false, length = 10)
  public String getNmno() {
    return this.nmno;
  }

  public void setNmno(String nmno) {
    this.nmno = nmno;
  }

  @Column(name = "APPLY_ID", nullable = false)
  public int getApplyId() {
    return this.applyId;
  }

  public void setApplyId(int applyId) {
    this.applyId = applyId;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof TblVisaListId))
      return false;
    TblVisaListId castOther = (TblVisaListId) other;

    return ((this.getNmno() == castOther.getNmno()) || (this.getNmno() != null
        && castOther.getNmno() != null && this.getNmno().equals(
        castOther.getNmno())))
        && (this.getApplyId() == castOther.getApplyId());
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + (getNmno() == null ? 0 : this.getNmno().hashCode());
    result = 37 * result + this.getApplyId();
    return result;
  }

}
