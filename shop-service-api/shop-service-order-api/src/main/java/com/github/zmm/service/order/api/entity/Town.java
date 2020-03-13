package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Town 镇
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class Town extends DataEntity<Town> {

	private String name;

	public Town() {
	}
	public Town(String id) {
		super.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
