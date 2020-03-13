package com.github.zmm.mq.model;

import com.github.zmm.mq.enums.MsgType;

import java.io.Serializable;
import java.util.Date;

/**
 * @Name SmsModel 短消息
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class SmsModel implements Serializable {

	private static final long serialVersionUID = -888661824696905703L;

	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * IP地址
	 */
	private String userIp;
	private MsgType type;
	private Date date;
	private String content;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public MsgType getType() {
		return type;
	}

	public void setType(MsgType type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return new org.apache.commons.lang3.builder.ToStringBuilder(this)
				.append("phone", phone)
				.append("userIp", userIp)
				.append("type", type)
				.append("date", date)
				.append("content", content)
				.toString();
	}
}
