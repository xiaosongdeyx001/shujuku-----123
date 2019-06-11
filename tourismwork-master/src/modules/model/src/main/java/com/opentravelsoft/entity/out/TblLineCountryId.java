package com.opentravelsoft.entity.out;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TblLineCountryId implements java.io.Serializable {

  private String lineNo;
  private String countryCd;

  public TblLineCountryId() {
  }

  public TblLineCountryId(String lineNo, String countryCd) {
    this.lineNo = lineNo;
    this.countryCd = countryCd;
  }

  @Column(name = "LINE_NO", nullable = false, length = 8)
  public String getLineNo() {
    return this.lineNo;
  }

  public void setLineNo(String lineNo) {
    this.lineNo = lineNo;
  }

  @Column(name = "COUNTRY_CD", nullable = false, length = 2)
  public String getCountryCd() {
    return this.countryCd;
  }

  public void setCountryCd(String countryCd) {
    this.countryCd = countryCd;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof TblLineCountryId))
      return false;
    TblLineCountryId castOther = (TblLineCountryId) other;

    return ((this.getLineNo() == castOther.getLineNo()) || (this.getLineNo() != null
        && castOther.getLineNo() != null && this.getLineNo().equals(
        castOther.getLineNo())))
        && ((this.getCountryCd() == castOther.getCountryCd()) || (this
            .getCountryCd() != null && castOther.getCountryCd() != null && this
            .getCountryCd().equals(castOther.getCountryCd())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result
        + (getLineNo() == null ? 0 : this.getLineNo().hashCode());
    result = 37 * result
        + (getCountryCd() == null ? 0 : this.getCountryCd().hashCode());
    return result;
  }

}
