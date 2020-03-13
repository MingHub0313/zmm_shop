package com.github.zmm.service.user.dao;

import com.github.zmm.service.user.api.entity.CashRecord;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name CashRecordDaoMapper  用户基础信息
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface CashRecordDaoMapper extends BaseDaoMapper<CashRecord> {
	/**
	 * 获取最新的一条现金记录
	 * @return
	 */
	CashRecord loadNewByUser(CashRecord cashRecord);

}
