package com.github.zmm.service.product.dao;

import com.github.zmm.service.product.api.entity.Picture;
import com.github.zmm.shop.common.core.dao.BaseDaoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name PictureDaoMapper 商品
 * @Author 900045
 * @Created by 2020/3/13 0013
 */
@Repository
public interface PictureDaoMapper extends BaseDaoMapper<Picture> {
	/**
	 * 根据商品ID获取该商品所有图片
	 * @param picture
	 * @return
	 */
	List<Picture> loadAllPicture(Picture picture);

	/**
	 * 根据商品ID获取默认的图片
	 * @param picture
	 * @return
	 */
	Picture loadDefaultPicture(Picture picture);

}
