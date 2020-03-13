package com.github.zmm.web.mobile.service;

import com.github.zmm.service.system.api.entity.Ad;
import com.github.zmm.service.system.api.entity.Notice;
import com.github.zmm.web.mobile.dto.SwiperDto;
import com.github.zmm.web.mobile.refactor.RefactorSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name SysIndexService
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Service
public class SysIndexService {

	@Autowired
	private RefactorSystemService systemService;

	public List<SwiperDto> getSwiper() {
		List<Ad> ads = systemService.getIndexAds();
		List<SwiperDto> swipers = new ArrayList<>();
		for (Ad ad : ads) {
			swipers.add(new SwiperDto(ad.getName(), ad.getPictureUrl(), ad.getLinkUrl()));
		}
		return swipers;
	}

	public List<Notice> getNotices() {
		List<Notice> notices = systemService.getIndexNotices();
		return notices;
	}
}