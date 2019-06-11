package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_permission")
public class Permission implements java.io.Serializable {

  private Integer permissionId;
  private String permissionCode;
  private String permissionKey;
  private String permissionName;

  public Permission() {
  }

  public Permission(String permissionCode, String permissionKey,
      String permissionName) {
    this.permissionCode = permissionCode;
    this.permissionKey = permissionKey;
    this.permissionName = permissionName;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "PermissionID", unique = true, nullable = false)
  public Integer getPermissionId() {
    return this.permissionId;
  }

  public void setPermissionId(Integer permissionId) {
    this.permissionId = permissionId;
  }

  @Column(name = "PermissionCode", nullable = false, length = 50)
  public String getPermissionCode() {
    return this.permissionCode;
  }

  public void setPermissionCode(String permissionCode) {
    this.permissionCode = permissionCode;
  }

  @Column(name = "PermissionKey", nullable = false, length = 50)
  public String getPermissionKey() {
    return this.permissionKey;
  }

  public void setPermissionKey(String permissionKey) {
    this.permissionKey = permissionKey;
  }

  @Column(name = "PermissionName", nullable = false, length = 50)
  public String getPermissionName() {
    return this.permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }

}
