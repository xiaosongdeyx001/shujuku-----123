package com.invoicing.manage.service;

import com.invoicing.manage.comment.entity.PageInfo;
import com.invoicing.manage.entity.GoodsBrandEntity;

import java.util.Map;
import java.util.List;
/**
 *
 * @time 2017年08月09日 01:13:02
 * @version 1.0
 *
 **/

public interface GoodsBrandService  {
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
	int insertSelective(GoodsBrandEntity record);
	/**
	 * 通过主键id 获取实体对象
	 * @param id
	 * @return
	 */
	GoodsBrandEntity selectByPrimaryKey(Long id);
	/**
	 * 通过主键id 更新实体
	 * @param record
	 * @return 1成功  其它失败
	 */
	int updateByPrimaryKeySelective(GoodsBrandEntity record);
	/**
	 * 通过map参数获取列表
	 * @param params
	 * @return List<GoodsBrandEntity>
	 */
	List<GoodsBrandEntity> getList(Map<String,Object> params);
	/**
	 * 通过map参数获取列表 分页
	 * @param params
	 * @return PageInfo<GoodsBrandEntity>
	 */
	PageInfo<GoodsBrandEntity> getList(PageInfo<GoodsBrandEntity> pageInfo,Map<String,Object> params);
	/**
	 * 通过map参数获取 总数
	 * @param params
	 * @return int
	 */
	int getListCount(Map<String,Object> params);

}