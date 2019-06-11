package com.opentravelsoft.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_visa_list")
public class TblVisaList implements java.io.Serializable {

  private TblVisaListId id;

  public TblVisaList() {
  }

  public TblVisaList(TblVisaListId id) {
    this.id = id;
  }

  @EmbeddedId
  @AttributeOverrides({
      @AttributeOverride(name = "nmno", column = @Column(name = "NMNO", nullable = false, length = 10)),
      @AttributeOverride(name = "applyId", column = @Column(name = "APPLY_ID", nullable = false)) })
  public TblVisaListId getId() {
    return this.id;
  }

  public void setId(TblVisaListId id) {
    this.id = id;
  }

}
