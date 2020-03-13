package com.github.zmm.service.message.api.entity;

import com.github.zmm.mq.enums.MsgType;
import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name SmsTemplate  短信模版
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class SmsTemplate extends DataEntity<SmsTemplate> {

	private MsgType type;
	private String content;
	private int timeout;
	private boolean isEnable;

	public SmsTemplate() {
	}

	public SmsTemplate(MsgType type) {
		this.type = type;
		this.isEnable = true;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean enable) {
		isEnable = enable;
	}
}
