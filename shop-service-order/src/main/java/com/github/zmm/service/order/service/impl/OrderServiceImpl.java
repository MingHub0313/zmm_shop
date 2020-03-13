package com.github.zmm.service.order.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.zmm.service.order.api.entity.ArayacakAddress;
import com.github.zmm.service.order.api.entity.DeliveryTime;
import com.github.zmm.service.order.api.entity.*;
import com.github.zmm.service.order.api.entity.OrderInfo;
import com.github.zmm.service.order.api.entity.OrderProductDetail;
import com.github.zmm.service.order.api.entity.Pay;
import com.github.zmm.service.order.api.entity.Town;
import com.github.zmm.service.order.api.service.OrderService;
import com.github.zmm.service.order.dao.ArayacakAddressDaoMapper;
import com.github.zmm.service.order.dao.DeliveryTimeDaoMapper;
import com.github.zmm.service.order.dao.FlowStatusDaoMapper;
import com.github.zmm.service.order.dao.OrderInfoDaoMapper;
import com.github.zmm.service.order.dao.OrderProductDetailDaoMapper;
import com.github.zmm.service.order.dao.PayDaoMapper;
import com.github.zmm.service.order.dao.TownDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Name OrderServiceImpl
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@RequestMapping("order")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderInfoDaoMapper orderInfoDao;
	@Autowired
	private OrderProductDetailDaoMapper orderProductDetailDao;
	@Autowired
	private DeliveryTimeDaoMapper deliveryTimeDao;
	@Autowired
	private PayDaoMapper payDao;
	@Autowired
	private TownDaoMapper townDao;
	@Autowired
	private ArayacakAddressDaoMapper arayacakAddressDao;
	@Autowired
	private FlowStatusDaoMapper flowStatusDao;


	@Override
	public List<DeliveryTime> getAllDeliveryTimes() {
		return deliveryTimeDao.loadAll();
	}

	@Override
	public DeliveryTime getDeliveryTime(String id) {
		return deliveryTimeDao.load(new DeliveryTime(id));
	}

	@Override
	public List<Pay> getAllPay() {
		return payDao.loadAll();
	}

	@Override
	public PageInfo<OrderInfo> getOrderInfos(String userId, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OrderInfo> orderInfos = orderInfoDao.loadByUserIdOrderByCreateDate(new OrderInfo(userId));
		for (OrderInfo order : orderInfos) {
			List<OrderProductDetail> orderProductDetails = orderProductDetailDao.loadByOrder(new OrderProductDetail(order.getId()));
			order.setOrderDetails(orderProductDetails);
		}
		PageInfo<OrderInfo> orderInfoPageInfo = new PageInfo<>(orderInfos);
		//Page<OrderInfo> orderInfoPage = new Page<>()
		//BeanUtils.copyProperties(orderInfoPage, orderInfoPageInfo)
		//orderInfoPage.setList(orderInfos)
		return orderInfoPageInfo;
	}

	@Override
	public OrderInfo getOrderDetail(String id) {
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setId(id);
		return orderInfoDao.load(orderInfo);
	}

	@Override
	public OrderInfo addOrder(OrderInfo orderInfo) {
		orderInfo.preInsert();
		orderInfoDao.save(orderInfo);
		return orderInfo;
	}

	@Override
	public Pay getPay(String id) {
		return payDao.load(new Pay(id));
	}

	@Override
	public Pay getRecommendPay() {
		Pay pay = new Pay();
		pay.setRecommend(true);
		return payDao.load(pay);
	}

	@Override
	public List<ArayacakAddress> getArayacakAddr(String countyId, String townId) {
		return arayacakAddressDao.loadAll(new ArayacakAddress(countyId, townId));
	}

	@Override
	public Town getTownById(String townId) {
		return townDao.load(new Town(townId));
	}

	@Override
	public ArayacakAddress getArayacakAddressById(String id) {
		return arayacakAddressDao.load(new ArayacakAddress(id));
	}

	@Override
	public List<FlowStatus> getFlowStatusesByPayWay(String payWay) {
		FlowStatus status = new FlowStatus();
		status.setPayWay(payWay);
		return flowStatusDao.loadAll(status);
	}

	@Override
	public FlowStatus getFlowStatusesById(String id) {
		FlowStatus status = new FlowStatus();
		status.setId(id);
		return flowStatusDao.load(status);
	}

	@Override
	public OrderProductDetail addOrderDetail(OrderProductDetail detail) {
		detail.preInsert();
		orderProductDetailDao.save(detail);
		return detail;
	}
}
