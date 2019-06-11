package com.opentravelsoft.service.setting;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opentravelsoft.entity.SysConfig;
import com.opentravelsoft.providers.SysConfigDao;

@Service("SysConfigService")
public class SysConfigServiceImpl implements SysConfigService {

  @Autowired
  private SysConfigDao sysConfigDao;

  public void deleteConfig(int configId) {
    sysConfigDao.remove(configId);
  }

  public List<SysConfig> getAllConfig() {
    return sysConfigDao.getAll();
  }

  public SysConfig getConfig(int configId) {
    return sysConfigDao.get(configId);
  }

  public void updateConfig(SysConfig config) {
    sysConfigDao.save(config);
  }

  public Set<String> getCategory() {
    return sysConfigDao.getCategory();
  }

  public List<SysConfig> getConfigByCategory(String category) {
    return sysConfigDao.getConfigByCategory(category);
  }

}
