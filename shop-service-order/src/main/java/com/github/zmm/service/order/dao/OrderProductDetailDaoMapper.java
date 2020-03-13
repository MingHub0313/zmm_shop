package com.github.zmm.service.order.dao;

import com.github.zmm.service.order.api.entity.OrderProductDetail;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name OrderProductDetailDaoMapper  订单子项表-客服
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface OrderProductDetailDaoMapper extends BaseDaoMapper<OrderProductDetail> {
	/**
	 * 获取该订单下的详情
	 * @param orderDetail
	 * @return
	 */
	List<OrderProductDetail> loadByOrder(OrderProductDetail orderDetail);
}
