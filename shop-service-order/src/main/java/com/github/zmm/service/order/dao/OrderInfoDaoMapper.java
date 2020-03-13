package com.github.zmm.service.order.dao;

import com.github.zmm.service.order.api.entity.OrderInfo;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name OrderInfoDaoMapper  订单
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface OrderInfoDaoMapper extends BaseDaoMapper<OrderInfo> {
	/**
	 * 获取该用户订单
	 * @param orderInfo
	 * @return
	 */
	List<OrderInfo> loadByUserIdOrderByCreateDate(OrderInfo orderInfo);

}
