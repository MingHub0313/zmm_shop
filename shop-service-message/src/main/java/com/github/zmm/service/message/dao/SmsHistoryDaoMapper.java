package com.github.zmm.service.message.dao;

import com.github.zmm.service.message.api.entity.SmsHistory;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name SmsHistoryDaoMapper 短信
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface SmsHistoryDaoMapper extends BaseDaoMapper<SmsHistory> {

	/**
	 * 当天发送的短信个数
	 * @param smsHistory
	 * @return
	 */
	int loadOneDayCount(SmsHistory smsHistory);
	/**
	 * 当前IP发送的短信个数
	 * @param smsHistory
	 * @return
	 */
	int loadCurrentIpCount(SmsHistory smsHistory);

	/**
	 * 获取最近的一条记录
	 * @param smsHistory
	 * @return
	 */
	SmsHistory loadNewByPhoneAndType(SmsHistory smsHistory);
}
