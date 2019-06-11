package com.opentravelsoft.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_visa_listitem")
public class TblVisaListitem implements java.io.Serializable {

  private TblVisaListitemId id;
  private int checkIn;
  private String note;

  public TblVisaListitem() {
  }

  public TblVisaListitem(TblVisaListitemId id, int checkIn) {
    this.id = id;
    this.checkIn = checkIn;
  }

  public TblVisaListitem(TblVisaListitemId id, int checkIn, String note) {
    this.id = id;
    this.checkIn = checkIn;
    this.note = note;
  }

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "nmno", column = @Column(name = "NMNO", nullable = false, length = 10)),
      @AttributeOverride(name = "itemId", column = @Column(name = "ITEM_ID", nullable = false)) })
  public TblVisaListitemId getId() {
    return this.id;
  }

  public void setId(TblVisaListitemId id) {
    this.id = id;
  }

  @Column(name = "CHECK_IN", nullable = false)
  public int getCheckIn() {
    return this.checkIn;
  }

  public void setCheckIn(int checkIn) {
    this.checkIn = checkIn;
  }

  @Column(name = "NOTE", length = 50)
  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}
