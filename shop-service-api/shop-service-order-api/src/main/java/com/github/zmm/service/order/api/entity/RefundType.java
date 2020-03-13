package com.github.zmm.service.order.api.entity;

/**
 * @Name RefundType 退款方式：微信零钱
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class RefundType {

	private String name;

	public String getName() {
		return name;
	}

	public RefundType setName(String name) {
		this.name = name;
		return this;
	}
}
