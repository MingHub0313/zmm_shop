package com.github.zmm.service.product.dao;

import com.github.zmm.service.product.api.entity.Product;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name ProductDaoMapper 商品
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface ProductDaoMapper extends BaseDaoMapper<Product> {
	/**
	 * 获取首页的商品
	 * @return
	 */
	List<Product> loadIndex();

	/**
	 * 获取商品 根据类型ID
	 * @param product
	 * @return
	 */
	List<Product> loadMallByTypeId(Product product);
}
