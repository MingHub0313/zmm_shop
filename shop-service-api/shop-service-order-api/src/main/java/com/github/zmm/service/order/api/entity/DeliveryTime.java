package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name DeliveryTime 配送时间
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class DeliveryTime extends DataEntity<DeliveryTime> {

	private String name;

	public DeliveryTime() {
	}

	public DeliveryTime(String id) {
		super.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
