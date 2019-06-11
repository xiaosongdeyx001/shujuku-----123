package com.opentravelsoft.entity.out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ad_position")
public class TblAdPosition implements java.io.Serializable {

  private Short positionId;
  private short storeId;
  private String positionName;
  private String positionDesc;
  private short width;
  private short height;

  public TblAdPosition() {
  }

  public TblAdPosition(short storeId, String positionName, String positionDesc,
      short width, short height) {
    this.storeId = storeId;
    this.positionName = positionName;
    this.positionDesc = positionDesc;
    this.width = width;
    this.height = height;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "POSITION_ID", unique = true, nullable = false)
  public Short getPositionId() {
    return this.positionId;
  }

  public void setPositionId(Short positionId) {
    this.positionId = positionId;
  }

  @Column(name = "STORE_ID", nullable = false)
  public short getStoreId() {
    return this.storeId;
  }

  public void setStoreId(short storeId) {
    this.storeId = storeId;
  }

  @Column(name = "POSITION_NAME", nullable = false, length = 60)
  public String getPositionName() {
    return this.positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  @Column(name = "POSITION_DESC", nullable = false)
  public String getPositionDesc() {
    return this.positionDesc;
  }

  public void setPositionDesc(String positionDesc) {
    this.positionDesc = positionDesc;
  }

  @Column(name = "WIDTH", nullable = false)
  public short getWidth() {
    return this.width;
  }

  public void setWidth(short width) {
    this.width = width;
  }

  @Column(name = "HEIGHT", nullable = false)
  public short getHeight() {
    return this.height;
  }

  public void setHeight(short height) {
    this.height = height;
  }

}
