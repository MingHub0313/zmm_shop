package com.github.zmm.service.message.service;

import com.github.zmm.mq.enums.MsgType;
import com.github.zmm.mq.model.SmsModel;
import com.github.zmm.service.message.api.entity.SmsHistory;
import com.github.zmm.service.message.api.entity.SmsTemplate;
import com.github.zmm.service.message.api.service.SmsService;
import com.github.zmm.service.message.dao.SmsHistoryDaoMapper;
import com.github.zmm.service.message.dao.SmsTemplateDaoMapper;
import com.github.zmm.shop.common.security.CodecUtil;
import com.github.zmm.shop.common.util.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.github.zmm.mq.constant.QueueName.ACTIVITY;
import static com.github.zmm.mq.constant.QueueName.NOTICE;
import static com.github.zmm.mq.constant.QueueName.VALIDATE;

/**
 * @Name SmsServiceImpl 短信服务
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Service("smsService")
public class SmsServiceImpl implements SmsService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SmsTemplateDaoMapper smsTemplateDao;
	@Autowired
	private SmsHistoryDaoMapper smsHistoryDao;

	@Override
	public int getCountByDay(String phone) {
		SmsHistory smsHistory = new SmsHistory();
		smsHistory.setPhone(phone);
		DateTime startOfDay = new DateTime().withTimeAtStartOfDay();
		smsHistory.setStartOfDay(new Date(startOfDay.getMillis()));
		return smsHistoryDao.loadOneDayCount(smsHistory);
	}
	@Override
	public int getCountByIp(String ip) {
		SmsHistory smsHistory = new SmsHistory();
		smsHistory.setUserIp(ip);
		DateTime startOfDay = new DateTime().withTimeAtStartOfDay();
		smsHistory.setStartOfDay(new Date(startOfDay.getMillis()));
		return smsHistoryDao.loadCurrentIpCount(smsHistory);
	}
	@Override
	@RabbitListener(queues = VALIDATE)
	public void sendValidate(SmsModel smsModel) {

		int constantValue= 4;
		int countByDay = getCountByDay(smsModel.getPhone());
		if (countByDay >= constantValue) {
			logger.warn("当前手机号"+smsModel.getPhone()+"发送次数太多");
			return;
		}
		int countByIp = getCountByIp(smsModel.getUserIp());
		if (countByIp >= constantValue) {
			logger.warn("当前IP"+smsModel.getUserIp()+"发送次数太多");
			return;
		}

		SmsTemplate validateTemplate = smsTemplateDao.load(new SmsTemplate(MsgType.VALIDATE));
		String code = CodecUtil.createRandomNum(4);
		String content = StringUtils.replace(StringUtils.replace(validateTemplate.getContent(), "[MSGCODE]", code),
				"[TIMEOUT]", validateTemplate.getTimeout()+"");

		logger.info("开始发送短信===> ",content);
		SmsHistory history = new SmsHistory();
		history.setPhone(smsModel.getPhone());
		history.setUserIp(smsModel.getUserIp());
		history.setContent(content);
		history.setSender("system");
		history.setTimeout(validateTemplate.getTimeout());
		history.setType(MsgType.VALIDATE);
		history.setValidate(code);
		history.preInsert();
		smsHistoryDao.save(history);
	}

	@Override
	public SmsHistory getInfoByPhoneAndType(String phone, MsgType type) {
		SmsHistory history = new SmsHistory();
		history.setPhone(phone);
		history.setType(MsgType.VALIDATE);
		return smsHistoryDao.loadNewByPhoneAndType(history);
	}

	@Override
	@RabbitListener(queues = NOTICE)
	public void sendNotice(SmsModel smsModel) {
		logger.info("==================> "+smsModel);

		SmsTemplate cashConsumeTemplate = smsTemplateDao.load(new SmsTemplate(MsgType.NOTICE_CASH_CONSUMER));
		String content = StringUtils.replace(StringUtils.replace(cashConsumeTemplate.getContent(), "[DATE]",
				DateTime.now().toString("MM月dd日HH时mm分")), "[AMOUNT]", smsModel.getContent());

		// 发送短信 开始
		logger.info("开始发送短信===> "+content);

		// 保存短息历史纪录
		SmsHistory history = new SmsHistory();
		history.setUserIp(smsModel.getUserIp());
		history.setPhone(smsModel.getPhone());
		history.setContent(content);
		history.setSender("system");
		history.setType(MsgType.NOTICE_CASH_CONSUMER);
		history.preInsert();
		smsHistoryDao.save(history);
	}

	@Override
	@RabbitListener(queues = ACTIVITY)
	public void sendActivity(String msgData) {
		logger.info("==================> "+msgData);
	}
}
