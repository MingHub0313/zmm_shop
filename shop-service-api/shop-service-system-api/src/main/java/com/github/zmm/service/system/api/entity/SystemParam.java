package com.github.zmm.service.system.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name SystemParam 系统参数
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class SystemParam extends DataEntity<SystemParam> {

	private String name;
	private String title;
	private String logo;
	private String description;
	private String copyright;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

}
