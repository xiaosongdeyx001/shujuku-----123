package com.opentravelsoft.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_line_visa")
public class LineVisa implements java.io.Serializable {

  private LineVisaId id;

  public LineVisa() {
    checked = "false";
  }

  public LineVisa(LineVisaId id) {
    this.id = id;
  }

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "lineNo", column = @Column(name = "LINE_NO", nullable = false, length = 8)),
      @AttributeOverride(name = "recNo", column = @Column(name = "REC_NO", nullable = false, length = 10)) })
  public LineVisaId getId() {
    return this.id;
  }

  public void setId(LineVisaId id) {
    this.id = id;
  }

  private int refNo;

  /** 国家 */
  private String countryCode;

  /** 国家 */
  private String countryName;

  /** 项目 */
  private String item;

  /** 单位 */
  private String unit;

  /** 特色描述 */
  private String description;

  private String checked;

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public int getRefNo() {
    return refNo;
  }

  public void setRefNo(int refNo) {
    this.refNo = refNo;
  }

  public String getChecked() {
    return checked;
  }

  public void setChecked(String checked) {
    this.checked = checked;
  }

}
