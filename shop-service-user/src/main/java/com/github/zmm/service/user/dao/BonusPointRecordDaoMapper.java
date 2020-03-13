package com.github.zmm.service.user.dao;

import com.github.zmm.service.user.api.entity.BonusPointRecord;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name BonusPointRecordDaoMapper  积分记录  记录积分的收支情况
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface BonusPointRecordDaoMapper extends BaseDaoMapper<BonusPointRecord> {

	/**
	 * 根据用户名获取最新一条积分
	 * @param bonusPointRecord
	 * @return
	 */
	BonusPointRecord loadNewByUSerId(BonusPointRecord bonusPointRecord);
	/**
	 * 根据用户名获取当前月积分
	 * @param bonusPointRecord
	 * @return
	 */
	List<BonusPointRecord> loadByUSerIdAndCurrentMonth(BonusPointRecord bonusPointRecord);

}
