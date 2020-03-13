package com.github.zmm.service.promotion.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name CouponCode 券明细---这个才是到用户手中的
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class CouponCode extends DataEntity<CouponCode> {

	private String couponId;
	private String code;
	private String accountId;
	private boolean isUsed;

	private Coupon coupon;

	public CouponCode() {
	}

	public CouponCode(String id, String accountId) {
		super.id = id;
		this.accountId = accountId;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean used) {
		isUsed = used;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

}
