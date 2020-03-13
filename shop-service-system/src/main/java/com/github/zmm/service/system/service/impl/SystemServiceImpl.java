package com.github.zmm.service.system.service.impl;

import com.github.zmm.service.system.api.entity.Ad;
import com.github.zmm.service.system.api.entity.Notice;
import com.github.zmm.service.system.api.service.SystemService;
import com.github.zmm.service.system.dao.AdDaoMapper;
import com.github.zmm.service.system.dao.NoticeDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Name SystemServiceImpl  广告
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@RestController
public class SystemServiceImpl implements SystemService {
	@Autowired
	private AdDaoMapper adDao;
	@Autowired
	private NoticeDaoMapper noticeDao;
	/**
	 * 获取首页的图片
	 *
	 * @return
	 */
	@Override
	public List<Ad> getIndexAds() {
		return adDao.loadIndexAds();
	}

	/**
	 * 获取首页的公告
	 *
	 * @return
	 */
	@Override
	public List<Notice> getIndexNotices() {
		return noticeDao.loadAll();
	}
}
