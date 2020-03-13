package com.github.zmm.service.mq.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Name RabbitSmsService  Rabbit接口
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@RequestMapping("log/sms")
public interface RabbitSmsService {
	/**
	 * 发送注册短消息
	 * @param msgData
	 */
	@PostMapping("validate")
	void sendValidate(Object msgData);

	/**
	 * 现金通知
	 * @param msgData
	 */
	@PostMapping("notify")
	void sendCashNotify(Object msgData);
}