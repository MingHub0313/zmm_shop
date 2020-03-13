package com.github.zmm.service.comment.service.impl;

import com.github.zmm.service.comment.api.entity.Comment;
import com.github.zmm.service.comment.api.service.CommentService;
import com.github.zmm.service.comment.dao.CommentDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Name CommentServiceImpl  评论
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@RestController
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDaoMapper commentDao;

	@Override
	public List<Comment> getByProductId(String productId) {
		return commentDao.loadAll(new Comment(productId));
	}
}
