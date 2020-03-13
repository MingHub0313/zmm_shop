package com.github.zmm.service.system.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name AdPosition 广告位置
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class AdPosition extends DataEntity<AdPosition> {

	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public AdPosition setName(String name) {
		this.name = name;
		return this;
	}

	public String getType() {
		return type;
	}

	public AdPosition setType(String type) {
		this.type = type;
		return this;
	}
}
