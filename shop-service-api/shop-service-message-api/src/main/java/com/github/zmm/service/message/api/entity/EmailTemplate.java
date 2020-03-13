package com.github.zmm.service.message.api.entity;

import com.github.zmm.mq.enums.MsgType;
import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name EmailTemplate  邮件模板
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class EmailTemplate extends DataEntity<EmailTemplate> {

	private MsgType type;
	private String content;
	private boolean isEnable;

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
