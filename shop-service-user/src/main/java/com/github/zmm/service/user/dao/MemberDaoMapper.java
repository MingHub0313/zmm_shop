package com.github.zmm.service.user.dao;

import com.github.zmm.service.user.api.entity.Member;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

/**
 * @Name MemberDaoMapper 用户基础信息
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface MemberDaoMapper extends BaseDaoMapper<Member> {
}
