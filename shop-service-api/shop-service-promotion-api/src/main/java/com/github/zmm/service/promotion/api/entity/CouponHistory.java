package com.github.zmm.service.promotion.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name CouponHistory 券记录
 * 含发券和用券两种记录 行为或结果：存储发券时候的渠道和用券时候的单号
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class CouponHistory extends DataEntity<CouponHistory> {

	private String code;
	private String txBehavior;
	private String accountId;
	private String isSendUsed;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTxBehavior() {
		return txBehavior;
	}

	public void setTxBehavior(String txBehavior) {
		this.txBehavior = txBehavior;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getIsSendUsed() {
		return isSendUsed;
	}

	public void setIsSendUsed(String isSendUsed) {
		this.isSendUsed = isSendUsed;
	}
}
