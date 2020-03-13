package com.github.zmm.service.user.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name CouponRecord  记录券的收支情况
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
public class CouponRecord extends DataEntity<CouponRecord> {
	private String accountId;
	private String couponCodeId;
	private String txType;
	private String behaviorId;
	private String txResult;

	public CouponRecord() {
	}

	public CouponRecord(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCouponCodeId() {
		return couponCodeId;
	}

	public void setCouponCodeId(String couponCodeId) {
		this.couponCodeId = couponCodeId;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public String getBehaviorId() {
		return behaviorId;
	}

	public void setBehaviorId(String behaviorId) {
		this.behaviorId = behaviorId;
	}

	public String getTxResult() {
		return txResult;
	}

	public void setTxResult(String txResult) {
		this.txResult = txResult;
	}
}
