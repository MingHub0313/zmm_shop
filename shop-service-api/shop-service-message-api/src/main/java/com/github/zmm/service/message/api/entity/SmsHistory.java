package com.github.zmm.service.message.api.entity;

import com.github.zmm.mq.enums.MsgType;
import com.github.zmm.shop.common.entity.DataEntity;

import java.util.Date;

/**
 * @Name SmsHistory
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class SmsHistory extends DataEntity<SmsHistory> {


	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 发送的内容
	 */
	private String content;
	/**
	 * 超时时间
	 */
	private int timeout;

	/**
	 * 类型
	 */
	private MsgType type;
	/**
	 * 发送者 默认：system
	 */
	private String sender;
	/**
	 * 接受者
	 */
	private String receiverId;
	/**
	 * IP地址
	 */
	private String userIp;
	/**
	 * 验证码
	 */
	private String validate;

	/**
	 * 当天的开始时间
	 */
	private Date startOfDay;

	public Date getStartOfDay() {
		return startOfDay;
	}

	public void setStartOfDay(Date startOfDay) {
		this.startOfDay = startOfDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public MsgType getType() {
		return type;
	}

	public void setType(MsgType type) {
		this.type = type;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}
}
