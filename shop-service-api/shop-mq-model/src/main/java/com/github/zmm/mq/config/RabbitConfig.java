package com.github.zmm.mq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.zmm.mq.constant.QueueName.ACTIVITY;
import static com.github.zmm.mq.constant.QueueName.EXCHANGE;
import static com.github.zmm.mq.constant.QueueName.NOTICE;
import static com.github.zmm.mq.constant.QueueName.VALIDATE;

/**
 * @Name RabbitConfig
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@Configuration
public class RabbitConfig {

	/**
	 * 短信验证通知
	 * @return
	 */
	@Bean
	public Queue validate() {
		return new Queue(VALIDATE);
	}

	/**
	 * 短信通知
	 * @return
	 */
	@Bean
	public Queue notice() {
		return new Queue(NOTICE);
	}

	/**
	 *  促销通知
	 * @return
	 */
	@Bean
	public Queue activity() {
		return new Queue(ACTIVITY);
	}

	/**
	 * 交换机
	 * @return
	 */
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(EXCHANGE);
	}

	@Bean
	public Binding bindingExchangeValidate(Queue validate, TopicExchange exchange) {
		return BindingBuilder.bind(validate).to(exchange).with(VALIDATE);
	}

	@Bean
	public Binding bindingExchangeNotice(Queue notice, TopicExchange exchange) {
		return BindingBuilder.bind(notice).to(exchange).with(NOTICE);
	}

	@Bean
	public Binding bindingExchangeActivity(Queue activity, TopicExchange exchange) {
		return BindingBuilder.bind(activity).to(exchange).with(ACTIVITY);
	}
}
