package com.github.zmm.mq.enums;

/**
 * @Name MsgType
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public enum MsgType {
	VALIDATE("验证码"),
	NOTICE_CASH_CONSUMER ("现金消费"),
	ACTIVITY("活动")
	;

	private String name;
	MsgType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
