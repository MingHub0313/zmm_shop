package com.github.zmm.service.comment.api.service;

import com.github.zmm.service.comment.api.entity.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Name CommentService 评论
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@RequestMapping("comment")
public interface CommentService {

	/**
	 * 获取该商品的评论
	 * @param productId
	 * @return
	 */
	@GetMapping("product-id")
	List<Comment> getByProductId(String productId);
}
