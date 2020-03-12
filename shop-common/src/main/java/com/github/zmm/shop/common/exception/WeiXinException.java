package com.github.zmm.shop.common.exception;

/**
 * @Name WeiXinException
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class WeiXinException {

	private int code;
	private String errorMsg;

	public WeiXinException() {
	}
	public WeiXinException(int code, String errorMsg) {
		this.code = code;
		this.errorMsg = errorMsg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
