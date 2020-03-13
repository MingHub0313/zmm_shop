package com.github.zmm.service.system.api.service;

import com.github.zmm.service.system.api.entity.Ad;
import com.github.zmm.service.system.api.entity.Notice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Name SystemService 广告
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@RequestMapping("/sys")
public interface SystemService {

	/**
	 * 获取首页的图片
	 * @return
	 */
	@GetMapping("index/ad")
	List<Ad> getIndexAds();

	/**
	 * 获取首页的公告
	 * @return
	 */
	@GetMapping("index/notices")
	List<Notice> getIndexNotices();
}
