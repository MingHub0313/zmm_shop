package com.github.zmm.shop.common.security;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

/**
 * @Name CodecUtil  编码与解码操作工具类
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class CodecUtil {

	/**
	 * 创建随机数
	 */
	public static String createRandomNum(int count) {
		return RandomStringUtils.randomNumeric(count);
	}

	/**
	 * 获取 UUID（32位）
	 */
	public static String createUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
}
