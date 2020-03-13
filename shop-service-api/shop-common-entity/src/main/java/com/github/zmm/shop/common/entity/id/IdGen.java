package com.github.zmm.shop.common.entity.id;

import java.util.UUID;

/**
 * @Name IdGen
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class IdGen {

	/**
	 * 封装JDK自带的UUID，中间无-分割
	 * @return
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
