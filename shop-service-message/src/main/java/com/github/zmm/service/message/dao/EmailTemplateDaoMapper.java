package com.github.zmm.service.message.dao;

import com.github.zmm.service.message.api.entity.EmailTemplate;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name EmailTemplateDaoMapper  邮箱模板
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface EmailTemplateDaoMapper extends BaseDaoMapper<EmailTemplate> {
}
