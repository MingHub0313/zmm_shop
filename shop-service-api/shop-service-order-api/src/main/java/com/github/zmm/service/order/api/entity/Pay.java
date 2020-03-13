package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Pay  支付方式：微信支付，支付宝支付，货到付款
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class Pay extends DataEntity<Pay> {

	private String name;
	private String payWay;
	private String icon;
	private int orderBy;
	private Boolean recommend;

	public Pay() {
	}

	public Pay(String id) {
		super.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}

	public Boolean getRecommend() {
		return recommend;
	}

	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

}
