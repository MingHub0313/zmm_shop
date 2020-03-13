package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name ReturnReason 退货原因
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ReturnReason extends DataEntity<ReturnReason> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
