package com.github.zmm.service.user.dao;

import com.github.zmm.service.user.api.entity.DeliveryAddress;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name DeliveryAddressDaoMapper 配送地址
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface DeliveryAddressDaoMapper extends BaseDaoMapper<DeliveryAddress> {
	/**
	 * 获取默认的配送地址
	 * @return
	 */
	//DeliveryAddress loadDefaultAddress( DeliveryAddress address);
}
