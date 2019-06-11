package com.opentravelsoft.entity.out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_region")
public class TblRegion implements java.io.Serializable {

  private int id;
  private String regionId;
  private String name;

  public TblRegion() {
  }

  public TblRegion(int id, String regionId) {
    this.id = id;
    this.regionId = regionId;
  }

  public TblRegion(int id, String regionId, String name) {
    this.id = id;
    this.regionId = regionId;
    this.name = name;
  }

  @Id
  @Column(name = "ID", unique = true, nullable = false)
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "REGION_ID", nullable = false, length = 6)
  public String getRegionId() {
    return this.regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  @Column(name = "NAME")
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
