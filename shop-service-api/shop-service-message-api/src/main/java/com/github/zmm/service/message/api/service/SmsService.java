package com.github.zmm.service.message.api.service;

import com.github.zmm.mq.enums.MsgType;
import com.github.zmm.mq.model.SmsModel;
import com.github.zmm.service.message.api.entity.SmsHistory;

/**
 * @Name SmsService  短信服务
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public interface SmsService {

	/**
	 * 获取当天发送短信的个数
	 * @param phone
	 * @return
	 */
	int getCountByDay(String phone);

	/**
	 * 获取当前IP发送短信的个数
	 * @param ip
	 * @return
	 */
	int getCountByIp(String ip);

	/**
	 * 发送注册短信
	 */
	void sendValidate(SmsModel smsModel);

	/**
	 * 获取记录根据手机号和类型
	 * @param phone
	 * @param type
	 * @return
	 */
	SmsHistory getInfoByPhoneAndType(String phone, MsgType type);

	/**
	 * 发送通知短信
	 * @param smsModel
	 */
	void sendNotice(SmsModel smsModel);

	/**
	 * 发送活动短信
	 * @param msgData
	 */
	void sendActivity(String msgData);

}
