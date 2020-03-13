package com.github.zmm.service.user.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Province 省份
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
public class Province extends DataEntity<Province> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
