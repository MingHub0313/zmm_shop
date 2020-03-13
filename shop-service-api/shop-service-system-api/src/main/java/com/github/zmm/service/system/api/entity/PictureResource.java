package com.github.zmm.service.system.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name PictureResource 图片资源
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Deprecated
public class PictureResource extends DataEntity<PictureResource> {
	private String pictureResourceType;
	private String name;
	private String picture_url;
	private String href;
	private String description;

	public String getPictureResourceType() {
		return pictureResourceType;
	}

	public PictureResource setPictureResourceType(String pictureResourceType) {
		this.pictureResourceType = pictureResourceType;
		return this;
	}

	public String getName() {
		return name;
	}

	public PictureResource setName(String name) {
		this.name = name;
		return this;
	}

	public String getPicture_url() {
		return picture_url;
	}

	public PictureResource setPicture_url(String picture_url) {
		this.picture_url = picture_url;
		return this;
	}

	public String getHref() {
		return href;
	}

	public PictureResource setHref(String href) {
		this.href = href;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public PictureResource setDescription(String description) {
		this.description = description;
		return this;
	}
}

