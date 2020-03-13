package com.github.zmm.service.order.api.enumtype;

/**
 * @Name FlowStatus 派送状态
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public enum FlowStatus {

	COD("货到付款"),
	UNPAID("未付款"),
	PAID("已付款"),
	PICKING("拣货中"),
	DISTRIBUTION("配送中"),
	DELIVER("派件中"),
	DELIVERED("已送达");

	private String name;
	FlowStatus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
