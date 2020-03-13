package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name ArayacakDeliveryTime  自提配送时间
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ArayacakDeliveryTime extends DataEntity<ArayacakDeliveryTime> {


	private String name;

	public String getName() {
		return name;
	}

	public ArayacakDeliveryTime setName(String name) {
		this.name = name;
		return this;
	}
}
