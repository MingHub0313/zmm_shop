package com.github.zmm.service.comment.dao;

import com.github.zmm.service.comment.api.entity.Comment;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name CommentDaoMapper
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface CommentDaoMapper extends BaseDaoMapper<Comment> {

	/**
	 * 获取商品的评论
	 * @param comment
	 * @return
	 */
	List<Comment> getByProductId(Comment comment);
}
