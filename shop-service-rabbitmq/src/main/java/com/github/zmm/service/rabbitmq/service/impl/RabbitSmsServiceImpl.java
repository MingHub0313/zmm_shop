package com.github.zmm.service.rabbitmq.service.impl;

import com.github.zmm.service.mq.api.RabbitSmsService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import static com.github.zmm.mq.constant.QueueName.EXCHANGE;
import static com.github.zmm.mq.constant.QueueName.NOTICE;
import static com.github.zmm.mq.constant.QueueName.VALIDATE;

/**
 * @Name RabbitSmsServiceImpl  消息列队
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@RestController
public class RabbitSmsServiceImpl implements RabbitSmsService {
	@Autowired
	private RabbitTemplate rabbitSmsTemplate;

	@Override
	public void sendValidate(Object data) {
		rabbitSmsTemplate.convertAndSend(EXCHANGE, VALIDATE, data);
	}

	@Override
	public void sendCashNotify(Object data) {
		rabbitSmsTemplate.convertAndSend(EXCHANGE, NOTICE, data);
	}
}
