package com.github.zmm.service.user.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

import java.math.BigDecimal;

/**
 * @Name CashRecord 记录现金账户的收支情况
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
public class CashRecord extends DataEntity<CashRecord> {

	private String accountId;
	private BigDecimal beforeMoney;
	private BigDecimal txMoney;
	private BigDecimal frozenMoney;
	private BigDecimal afterBonusPoints;
	private String txType;
	private String behaviorId;
	private String txResult;

	public CashRecord() {
	}

	public CashRecord(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getBeforeMoney() {
		return beforeMoney;
	}

	public void setBeforeMoney(BigDecimal beforeMoney) {
		this.beforeMoney = beforeMoney;
	}

	public BigDecimal getTxMoney() {
		return txMoney;
	}

	public void setTxMoney(BigDecimal txMoney) {
		this.txMoney = txMoney;
	}

	public BigDecimal getFrozenMoney() {
		return frozenMoney;
	}

	public void setFrozenMoney(BigDecimal frozenMoney) {
		this.frozenMoney = frozenMoney;
	}

	public BigDecimal getAfterBonusPoints() {
		return afterBonusPoints;
	}

	public void setAfterBonusPoints(BigDecimal afterBonusPoints) {
		this.afterBonusPoints = afterBonusPoints;
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
