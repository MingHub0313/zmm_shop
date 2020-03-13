package com.github.zmm.service.system.dao;

import com.github.zmm.service.system.api.entity.Ad;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name AdDaoMapper
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface AdDaoMapper extends BaseDaoMapper<Ad> {
	/**
	 * 获取首页的广告图片
	 * @return
	 */
	List<Ad> loadIndexAds();

}
