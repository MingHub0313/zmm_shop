package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Province 省
 * @Author 900045
 * @Created by 2020/3/12 0012
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
