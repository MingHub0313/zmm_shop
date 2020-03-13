package com.github.zmm.service.user.dao;

import com.github.zmm.service.user.api.entity.CouponRecord;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name CouponRecordDaoMapper 记录券的收支情况
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface CouponRecordDaoMapper extends BaseDaoMapper<CouponRecord> {
	/**
	 * 根据用户获取券记录
	 * @param couponRecord
	 * @return
	 */
	CouponRecord loadByUser(CouponRecord couponRecord);

}
