package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Country 市区县
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class Country extends DataEntity<Country> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
