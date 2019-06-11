package com.opentravelsoft.service.security;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opentravelsoft.entity.Module;
import com.opentravelsoft.entity.Role;
import com.opentravelsoft.providers.PermissionDao;
import com.opentravelsoft.providers.RoleDao;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleDao roleDao;

  @Autowired
  private PermissionDao permissionDao;

  public List<Role> roGetQueryRole(String keyword) {
    return roleDao.queryRole(keyword);
  }

  public Role roGetRoleDetail(int roleId) {
    return roleDao.get(roleId);
  }

  public List<Role> roGetRoleList() {
    return roleDao.getRoleList();
  }

  public void txDelRole(int roleId) {
    roleDao.remove(roleId);
  }

  public Role txSaveRole(Role role) {
    return roleDao.save(role);
  }

  public Map<Integer, String> roGetPermissions() {
    return permissionDao.getPermissions();
  }

  public List<Module> roGetModulePermission(int roleId) {
    return roleDao.getModulePermission(roleId);
  }

}
