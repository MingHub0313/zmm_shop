package com.github.zmm.service.cart.service.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name CartInfo 购物车
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class CartInfo extends DataEntity<CartInfo> {

	private String accessId;
	private String productId;
	private int quantity;
	private boolean isChoose;

	public CartInfo() {
	}

	public CartInfo(String accessId, String productId, int quantity) {
		this.accessId = accessId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public String getAccessId() {
		return accessId;
	}

	public CartInfo setAccessId(String accessId) {
		this.accessId = accessId;
		return this;
	}

	public String getProductId() {
		return productId;
	}

	public CartInfo setProductId(String productId) {
		this.productId = productId;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isChoose() {
		return isChoose;
	}

	public void setChoose(boolean choose) {
		isChoose = choose;
	}
}
