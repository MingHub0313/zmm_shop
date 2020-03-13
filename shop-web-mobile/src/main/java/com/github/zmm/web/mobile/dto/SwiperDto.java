package com.github.zmm.web.mobile.dto;

/**
 * @Name SwiperDto
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
public class SwiperDto {

	private String name;
	private String pictureUrl;
	private String linkUrl;

	public SwiperDto(String name, String pictureUrl, String linkUrl) {
		this.name = name;
		this.pictureUrl = pictureUrl;
		this.linkUrl = linkUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
}
