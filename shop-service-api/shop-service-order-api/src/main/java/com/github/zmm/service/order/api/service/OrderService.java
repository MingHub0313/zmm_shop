package com.github.zmm.service.order.api.service;

import com.github.pagehelper.PageInfo;
import com.github.zmm.service.order.api.entity.ArayacakAddress;
import com.github.zmm.service.order.api.entity.DeliveryTime;
import com.github.zmm.service.order.api.entity.OrderInfo;
import com.github.zmm.service.order.api.entity.OrderProductDetail;
import com.github.zmm.service.order.api.entity.Pay;
import com.github.zmm.service.order.api.entity.Town;
import com.github.zmm.service.order.api.entity.FlowStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @Name OrderService
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@RequestMapping("order")
public interface OrderService {

	/**
	 * 获取配送时间
	 * @return
	 */
	@GetMapping("delivery/times")
	List<DeliveryTime> getAllDeliveryTimes();

	/**
	 * 根据ID获取配送的时间
	 * @param id
	 * @return
	 */
	@GetMapping("delivery/time/id")
	DeliveryTime getDeliveryTime(@RequestParam("id") String id);
	/**
	 * 获取所有的支付
	 * @return
	 */
	List<Pay> getAllPay();
	/**
	 * 获取支付
	 * @return
	 */
	Pay getPay(String id);

	/**
	 * 获取推荐的支付
	 * @return
	 */
	Pay getRecommendPay();

	/**
	 * 获取所有的订单
	 * @param userId
	 * @return
	 */
	PageInfo<OrderInfo> getOrderInfos(String userId, int pageNum, int pageSize) throws InvocationTargetException, IllegalAccessException;

	/**
	 * 获取订单详情
	 * @param userId
	 * @return
	 */
	OrderInfo getOrderDetail(String userId);

	/**
	 * 保存订单
	 * @param orderInfo
	 */
	OrderInfo addOrder(OrderInfo orderInfo);

	/**
	 * 获取全部镇自提地址 // 根据GPS获取自提地点->根据自提地点搜索地点的ID
	 * @return
	 */
	List<ArayacakAddress> getArayacakAddr(String countyId, String townId);

	/**
	 * 根据ID获取镇
	 * @param townId
	 * @return
	 */
	Town getTownById(String townId);

	/**
	 * 根据ID获取自提地点
	 * @param id
	 * @return
	 */
	ArayacakAddress getArayacakAddressById(String id);

	/**
	 * 根据支付方式获取不同的订单流程
	 * @param payWay
	 * @return
	 */
	List<FlowStatus> getFlowStatusesByPayWay(String payWay);

	/**
	 * 根据ID获取订单流程名字
	 * @param id
	 * @return
	 */
	FlowStatus getFlowStatusesById(String id);

	/**
	 * 保存商品详情
	 * @param detail
	 * @return
	 */
	OrderProductDetail addOrderDetail(OrderProductDetail detail);
}
