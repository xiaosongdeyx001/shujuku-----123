package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_portal_category")
public class PortalCategory implements java.io.Serializable {

  private String code;
  private String cnName;
  private String level;
  private String upCode;
  private String nextKey;
  private String fullName;
  private String mapFile1;

  public PortalCategory() {
  }

  public PortalCategory(String code) {
    this.code = code;
  }

  public PortalCategory(String code, String cnName, String level,
      String upCode, String nextKey, String fullName, String mapFile1) {
    this.code = code;
    this.cnName = cnName;
    this.level = level;
    this.upCode = upCode;
    this.nextKey = nextKey;
    this.fullName = fullName;
    this.mapFile1 = mapFile1;
  }

  @Id
  @Column(name = "CODE", unique = true, nullable = false, length = 10)
  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Column(name = "CN_NAME", length = 30)
  public String getCnName() {
    return this.cnName;
  }

  public void setCnName(String cnName) {
    this.cnName = cnName;
  }

  @Column(name = "LEVEL", length = 1)
  public String getLevel() {
    return this.level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Column(name = "UP_CODE", length = 8)
  public String getUpCode() {
    return this.upCode;
  }

  public void setUpCode(String upCode) {
    this.upCode = upCode;
  }

  @Column(name = "NEXT_KEY", length = 1)
  public String getNextKey() {
    return this.nextKey;
  }

  public void setNextKey(String nextKey) {
    this.nextKey = nextKey;
  }

  @Column(name = "FULL_NAME", length = 120)
  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Column(name = "MAP_FILE1", length = 50)
  public String getMapFile1() {
    return this.mapFile1;
  }

  public void setMapFile1(String mapFile1) {
    this.mapFile1 = mapFile1;
  }

}
