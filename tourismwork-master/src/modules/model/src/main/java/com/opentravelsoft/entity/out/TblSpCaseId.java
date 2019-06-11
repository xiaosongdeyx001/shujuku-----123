package com.opentravelsoft.entity.out;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TblSpCaseId implements java.io.Serializable {

  private String spId;
  private int spQuoteId;

  public TblSpCaseId() {
  }

  public TblSpCaseId(String spId, int spQuoteId) {
    this.spId = spId;
    this.spQuoteId = spQuoteId;
  }

  @Column(name = "SP_ID", nullable = false, length = 10)
  public String getSpId() {
    return this.spId;
  }

  public void setSpId(String spId) {
    this.spId = spId;
  }

  @Column(name = "SP_QUOTE_ID", nullable = false)
  public int getSpQuoteId() {
    return this.spQuoteId;
  }

  public void setSpQuoteId(int spQuoteId) {
    this.spQuoteId = spQuoteId;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof TblSpCaseId))
      return false;
    TblSpCaseId castOther = (TblSpCaseId) other;

    return ((this.getSpId() == castOther.getSpId()) || (this.getSpId() != null
        && castOther.getSpId() != null && this.getSpId().equals(
        castOther.getSpId())))
        && (this.getSpQuoteId() == castOther.getSpQuoteId());
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + (getSpId() == null ? 0 : this.getSpId().hashCode());
    result = 37 * result + this.getSpQuoteId();
    return result;
  }

}
