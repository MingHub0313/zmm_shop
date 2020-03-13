package com.github.zmm.service.order.api.entity;

import com.github.zmm.shop.common.entity.DataEntity;

/**
 * @Name ArayacakAddress  自提地点
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class ArayacakAddress extends DataEntity<ArayacakAddress> {

	private String name;
	private String province;
	private String city;
	private String country;
	private String town;
	private String village;
	private String address;

	public ArayacakAddress() {
	}
	public ArayacakAddress(String id) {
		super.id = id;
	}
	public ArayacakAddress(String countryId, String townId) {
		this.country = countryId;
		this.town = townId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
