package com.github.zmm.shop.common.exception;

/**
 * @Name ErrorEntity  错误消息 包装类
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ErrorEntity {

	private String errCode;
	private String errMsg;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
