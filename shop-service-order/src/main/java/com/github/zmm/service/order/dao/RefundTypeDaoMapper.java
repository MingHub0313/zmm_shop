package com.github.zmm.service.order.dao;

import com.github.zmm.service.order.api.entity.RefundType;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name RefundTypeDaoMapper 退款方式：微信零钱
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface RefundTypeDaoMapper extends BaseDaoMapper<RefundType> {
}
