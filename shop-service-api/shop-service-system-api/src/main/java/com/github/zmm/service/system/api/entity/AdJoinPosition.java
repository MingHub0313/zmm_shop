package com.github.zmm.service.system.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name AdJoinPosition 广告与位置关联
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class AdJoinPosition extends DataEntity<AdJoinPosition> {

	private String adId;
	private String adPositionId;

	public String getAdId() {
		return adId;
	}

	public AdJoinPosition setAdId(String adId) {
		this.adId = adId;
		return this;
	}

	public String getAdPositionId() {
		return adPositionId;
	}

	public AdJoinPosition setAdPositionId(String adPositionId) {
		this.adPositionId = adPositionId;
		return this;
	}

}
