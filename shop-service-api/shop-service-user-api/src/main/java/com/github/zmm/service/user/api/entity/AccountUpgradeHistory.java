package com.github.zmm.service.user.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name AccountUpgradeHistory 账户升级历史
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class AccountUpgradeHistory extends DataEntity<AccountUpgradeHistory> {
	private int accountId;
	private int previousLevels;
	private int currentLevels;
	private int previousBonusPoint;
	private int currentBonusPoint;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getPreviousLevels() {
		return previousLevels;
	}

	public void setPreviousLevels(int previousLevels) {
		this.previousLevels = previousLevels;
	}

	public int getCurrentLevels() {
		return currentLevels;
	}

	public void setCurrentLevels(int currentLevels) {
		this.currentLevels = currentLevels;
	}

	public int getPreviousBonusPoint() {
		return previousBonusPoint;
	}

	public void setPreviousBonusPoint(int previousBonusPoint) {
		this.previousBonusPoint = previousBonusPoint;
	}

	public int getCurrentBonusPoint() {
		return currentBonusPoint;
	}

	public void setCurrentBonusPoint(int currentBonusPoint) {
		this.currentBonusPoint = currentBonusPoint;
	}
}
