package com.github.zmm.service.cart.service.api.model;

import java.io.Serializable;

/**
 * @Name ProductModel
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ProductModel implements Serializable {


	private String id;
	private int count;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
