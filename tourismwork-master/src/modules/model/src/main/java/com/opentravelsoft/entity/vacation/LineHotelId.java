package com.opentravelsoft.entity.vacation;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LineHotelId implements java.io.Serializable {

  private String lineNo;
  private String hotCd;

  public LineHotelId() {
  }

  public LineHotelId(String lineNo, String hotCd) {
    this.lineNo = lineNo;
    this.hotCd = hotCd;
  }

  @Column(name = "LINE_NO", nullable = false, length = 10)
  public String getLineNo() {
    return this.lineNo;
  }

  public void setLineNo(String lineNo) {
    this.lineNo = lineNo;
  }

  @Column(name = "HOT_CD", nullable = false, length = 10)
  public String getHotCd() {
    return this.hotCd;
  }

  public void setHotCd(String hotCd) {
    this.hotCd = hotCd;
  }

  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof LineHotelId))
      return false;
    LineHotelId castOther = (LineHotelId) other;

    return ((this.getLineNo() == castOther.getLineNo()) || (this.getLineNo() != null
        && castOther.getLineNo() != null && this.getLineNo().equals(
        castOther.getLineNo())))
        && ((this.getHotCd() == castOther.getHotCd()) || (this.getHotCd() != null
            && castOther.getHotCd() != null && this.getHotCd().equals(
            castOther.getHotCd())));
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result
        + (getLineNo() == null ? 0 : this.getLineNo().hashCode());
    result = 37 * result
        + (getHotCd() == null ? 0 : this.getHotCd().hashCode());
    return result;
  }

}
