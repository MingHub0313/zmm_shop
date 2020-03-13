package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Village 村庄
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class Village extends DataEntity<Village> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
