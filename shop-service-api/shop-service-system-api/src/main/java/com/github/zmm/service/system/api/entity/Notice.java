package com.github.zmm.service.system.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name Notice 通知
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class Notice extends DataEntity<Notice> {

	private String title;
	private String content;
	private String linkUrl;

	public String getTitle() {
		return title;
	}

	public Notice setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getContent() {
		return content;
	}

	public Notice setContent(String content) {
		this.content = content;
		return this;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
}
