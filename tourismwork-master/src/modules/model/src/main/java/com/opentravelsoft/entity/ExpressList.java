package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_crm_expresslist")
public class ExpressList implements java.io.Serializable {

  private Integer itemId;
  private String expressId;
  private String itemName;
  private String note;
  private Integer itemNum;
  private String expressType;
  private String unit;

  public ExpressList() {
  }

  public ExpressList(String expressId) {
    this.expressId = expressId;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "ITEM_ID", unique = true, nullable = false)
  public Integer getItemId() {
    return this.itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  @Column(name = "EXPRESS_ID", nullable = false, length = 10)
  public String getExpressId() {
    return this.expressId;
  }

  public void setExpressId(String expressId) {
    this.expressId = expressId;
  }

  @Column(name = "ITEM_NAME")
  public String getItemName() {
    return this.itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  @Column(name = "NOTE")
  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Column(name = "ITEM_NUM")
  public Integer getItemNum() {
    return this.itemNum;
  }

  public void setItemNum(Integer itemNum) {
    this.itemNum = itemNum;
  }

  @Column(name = "EXPRESS_TYPE", length = 10)
  public String getExpressType() {
    return this.expressType;
  }

  public void setExpressType(String expressType) {
    this.expressType = expressType;
  }

  @Column(name = "UNIT", length = 10)
  public String getUnit() {
    return this.unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ExpressList(int itemId) {
    this.itemId = itemId;
  }

}
