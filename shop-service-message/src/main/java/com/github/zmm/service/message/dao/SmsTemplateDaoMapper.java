package com.github.zmm.service.message.dao;

import com.github.zmm.service.message.api.entity.SmsTemplate;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name SmsTemplateDaoMapper  短信模板
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface SmsTemplateDaoMapper extends BaseDaoMapper<SmsTemplate> {

	/**
	 * 获取正在使用的模板
	 * @return
	 */
	SmsTemplate loadRegTemp();
}
