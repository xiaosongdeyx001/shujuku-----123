package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_sight_comment")
public class SightComment implements java.io.Serializable {

  private String recNo;
  private String districtNo;
  private String tital;
  private String note;

  public SightComment() {
  }

  public SightComment(String recNo) {
    this.recNo = recNo;
  }

  public SightComment(String recNo, String districtNo, String tital, String note) {
    this.recNo = recNo;
    this.districtNo = districtNo;
    this.tital = tital;
    this.note = note;
  }

  @Id
  @Column(name = "REC_NO", unique = true, nullable = false, length = 10)
  public String getRecNo() {
    return this.recNo;
  }

  public void setRecNo(String recNo) {
    this.recNo = recNo;
  }

  @Column(name = "DISTRICT_NO", length = 10)
  public String getDistrictNo() {
    return this.districtNo;
  }

  public void setDistrictNo(String districtNo) {
    this.districtNo = districtNo;
  }

  @Column(name = "TITAL", length = 100)
  public String getTital() {
    return this.tital;
  }

  public void setTital(String tital) {
    this.tital = tital;
  }

  @Column(name = "NOTE", length = 1500)
  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}
