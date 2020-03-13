package com.github.zmm.service.user.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name ProductFocus  关注商品
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
public class ProductFocus extends DataEntity<ProductFocus> {

	private String accountId;
	private String productId;

	public ProductFocus() {
	}

	public ProductFocus(String accountId, String productId) {
		this.accountId = accountId;
		this.productId = productId;
	}

	//public ProductFocus(String accountId, String productId, Status status) {
	//    this.accountId = accountId;
	//    this.productId = productId;
	//    super.status = status;
	//}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
