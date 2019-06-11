package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tbl_module_permission", uniqueConstraints = @UniqueConstraint(columnNames = {
    "ModuleID", "PermissionID", "RoleID", "UserID" }))
public class ModulePermission implements java.io.Serializable {

  private Integer modulePermissionId;
  private int moduleId;
  private int permissionId;
  private byte allowAccess;
  private Integer roleId;
  private Integer userId;

  public ModulePermission() {
  }

  public ModulePermission(int moduleId, int permissionId, byte allowAccess) {
    this.moduleId = moduleId;
    this.permissionId = permissionId;
    this.allowAccess = allowAccess;
  }

  public ModulePermission(int moduleId, int permissionId, byte allowAccess,
      Integer roleId, Integer userId) {
    this.moduleId = moduleId;
    this.permissionId = permissionId;
    this.allowAccess = allowAccess;
    this.roleId = roleId;
    this.userId = userId;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "ModulePermissionID", unique = true, nullable = false)
  public Integer getModulePermissionId() {
    return this.modulePermissionId;
  }

  public void setModulePermissionId(Integer modulePermissionId) {
    this.modulePermissionId = modulePermissionId;
  }

  @Column(name = "ModuleID", nullable = false)
  public int getModuleId() {
    return this.moduleId;
  }

  public void setModuleId(int moduleId) {
    this.moduleId = moduleId;
  }

  @Column(name = "PermissionID", nullable = false)
  public int getPermissionId() {
    return this.permissionId;
  }

  public void setPermissionId(int permissionId) {
    this.permissionId = permissionId;
  }

  @Column(name = "AllowAccess", nullable = false)
  public byte getAllowAccess() {
    return this.allowAccess;
  }

  public void setAllowAccess(byte allowAccess) {
    this.allowAccess = allowAccess;
  }

  @Column(name = "RoleID")
  public Integer getRoleId() {
    return this.roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  @Column(name = "UserID")
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

}
