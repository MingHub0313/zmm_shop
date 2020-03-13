package com.github.zmm.service.order.dao;

import com.github.zmm.service.order.api.entity.Pay;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name PayDaoMapper 支付方式：微信支付，支付宝支付，货到付款
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface PayDaoMapper extends BaseDaoMapper<Pay> {
}