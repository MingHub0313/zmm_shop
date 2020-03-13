package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

import java.math.BigDecimal;

/**
 * @Name OrderReturnDetail 退单子项
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class OrderReturnDetail extends DataEntity<OrderReturnDetail> {

	private String returnOid;
	private String no;
	private String name;
	private int quantity;
	private BigDecimal subtotal;
	private BigDecimal marketPrice;
	private BigDecimal salePrice;
	private BigDecimal dealPrice;
	private double discountRate;
	private boolean isGift;

	public String getReturnOid() {
		return returnOid;
	}

	public OrderReturnDetail setReturnOid(String returnOid) {
		this.returnOid = returnOid;
		return this;
	}

	public String getNo() {
		return no;
	}

	public OrderReturnDetail setNo(String no) {
		this.no = no;
		return this;
	}

	public String getName() {
		return name;
	}

	public OrderReturnDetail setName(String name) {
		this.name = name;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public OrderReturnDetail setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public OrderReturnDetail setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
		return this;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public OrderReturnDetail setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
		return this;
	}

	public BigDecimal getDealPrice() {
		return dealPrice;
	}

	public OrderReturnDetail setDealPrice(BigDecimal dealPrice) {
		this.dealPrice = dealPrice;
		return this;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public OrderReturnDetail setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
		return this;
	}

	public boolean isGift() {
		return isGift;
	}

	public OrderReturnDetail setGift(boolean gift) {
		isGift = gift;
		return this;
	}
}
