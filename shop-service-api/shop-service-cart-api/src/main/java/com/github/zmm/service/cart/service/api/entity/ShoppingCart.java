package com.github.zmm.service.cart.service.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

import java.util.List;

/**
 * @Name ShoppingCart
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ShoppingCart extends DataEntity<ShoppingCart> {

	private String accessId;
	private int totalQuantity;

	private List<CartInfo> cartInfos;

	public String getAccessId() {
		return accessId;
	}

	public ShoppingCart setAccessId(String accessId) {
		this.accessId = accessId;
		return this;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public List<CartInfo> getCartInfos() {
		return cartInfos;
	}

	public void setCartInfos(List<CartInfo> cartInfos) {
		this.cartInfos = cartInfos;
	}
}
