package com.github.zmm.service.system.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name PictureResourceType 图片资源类型：现在就首页的图片
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Deprecated
public class PictureResourceType extends DataEntity<PictureResourceType> {
	private String name;

	public String getName() {
		return name;
	}

	public PictureResourceType setName(String name) {
		this.name = name;
		return this;
	}
}
