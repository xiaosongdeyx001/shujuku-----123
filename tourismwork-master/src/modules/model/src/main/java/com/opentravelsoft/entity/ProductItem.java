package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product_item")
public class ProductItem implements java.io.Serializable {

  private Integer itemId;
  private Category category;
  private String itemCode;
  private String itemName;
  private int sortOrder;
  private byte isActive;
  private byte showInPortal;
  private byte isTmpl;
  private byte isText;
  private byte hasTitle;
  private byte systemList;
  private String linkUrl;

  public ProductItem() {
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

  @Column(name = "ITEM_CODE", nullable = false, length = 50)
  public String getItemCode() {
    return this.itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  @Column(name = "ITEM_NAME", nullable = false, length = 50)
  public String getItemName() {
    return this.itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  @Column(name = "SORT_ORDER", nullable = false)
  public int getSortOrder() {
    return this.sortOrder;
  }

  public void setSortOrder(int sortOrder) {
    this.sortOrder = sortOrder;
  }

  @Column(name = "IS_ACTIVE", nullable = false)
  public byte getIsActive() {
    return this.isActive;
  }

  public void setIsActive(byte isActive) {
    this.isActive = isActive;
  }

  @Column(name = "SHOW_IN_PORTAL", nullable = false)
  public byte getShowInPortal() {
    return this.showInPortal;
  }

  public void setShowInPortal(byte showInPortal) {
    this.showInPortal = showInPortal;
  }

  @Column(name = "IS_TMPL", nullable = false)
  public byte getIsTmpl() {
    return this.isTmpl;
  }

  public void setIsTmpl(byte isTmpl) {
    this.isTmpl = isTmpl;
  }

  @Column(name = "IS_TEXT", nullable = false)
  public byte getIsText() {
    return this.isText;
  }

  public void setIsText(byte isText) {
    this.isText = isText;
  }

  @Column(name = "HAS_TITLE", nullable = false)
  public byte getHasTitle() {
    return this.hasTitle;
  }

  public void setHasTitle(byte hasTitle) {
    this.hasTitle = hasTitle;
  }

  @Column(name = "SYSTEM_LIST", nullable = false)
  public byte getSystemList() {
    return this.systemList;
  }

  public void setSystemList(byte systemList) {
    this.systemList = systemList;
  }

  @Column(name = "LINK_URL", length = 200)
  public String getLinkUrl() {
    return this.linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CAT_ID")
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

}
