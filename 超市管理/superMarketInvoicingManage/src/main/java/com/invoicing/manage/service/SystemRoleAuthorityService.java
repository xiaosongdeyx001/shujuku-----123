package com.invoicing.manage.service;

import com.invoicing.manage.entity.SystemRoleAuthorityEntity;

import java.util.Map;
import java.util.List;

import com.invoicing.manage.comment.entity.PageInfo;
/**
 *
 * @time 2017年08月08日 00:19:07
 * @version 1.0
 *
 **/

public interface SystemRoleAuthorityService  {
  	/**
	 * 通过主键id 删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Long id);
	/**
	 * 插入实体
	 * @param record
	 * @return
	 */
	int insertSelective(SystemRoleAuthorityEntity record);
	/**
	 * 通过主键id 获取实体对象
	 * @param id
	 * @return
	 */
	SystemRoleAuthorityEntity getRoleAuthority(Map<String,Object> map);
	/**
	 * 通过主键id 更新实体
	 * @param record
	 * @return 1成功  其它失败
	 */
	int updateByPrimaryKeySelective(SystemRoleAuthorityEntity record);
	/**
	 * 通过map参数获取列表
	 * @param params
	 * @return List<SystemRoleAuthorityEntity>
	 */
	List<SystemRoleAuthorityEntity> getList(Map<String,Object> params);
	/**
	 * 通过map参数获取列表 分页
	 * @param params
	 * @return PageInfo<SystemRoleAuthorityEntity>
	 */
	PageInfo<SystemRoleAuthorityEntity> getList(PageInfo<SystemRoleAuthorityEntity> pageInfo,Map<String,Object> params);
	/**
	 * 通过map参数获取 总数
	 * @param params
	 * @return int
	 */
	int getListCount(Map<String,Object> params);

}