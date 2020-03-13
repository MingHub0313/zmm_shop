package com.github.zmm.service.product.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name ProductType 商品类型
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ProductType extends DataEntity<ProductType> {
	private String name;

	public ProductType() {}

	public ProductType(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
