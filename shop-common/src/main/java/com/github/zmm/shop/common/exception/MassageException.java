package com.github.zmm.shop.common.exception;

/**
 * @Name MassageException
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class MassageException extends RuntimeException {

	private int code;
	private String errorMsg;

	public MassageException() {
	}
	public MassageException(int code, String errorMsg) {
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
