package com.github.zmm.service.order.api.enumtype;

/**
 * @Name OrderStatus
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public interface OrderStatus {

	/**
	 *  无效的订单 (前端用的)
	 */
	String INVALID = "0";

	/**
	 * 等待付款 倒计时15分钟内付款 进入下一个流程，否则进入付款超时（已失效）
	 */
	String WAIT_PAY = "1";

	/**
	 * 进行中
	 */
	String ONGOING = "2";

	/**
	 * 等待评论
	 */
	String COMMENT = "3";

	/**
	 * 完成
	 */
	String FINISHED = "4";

	/**
	 * 付款超时
	 */
	String PAY_OUT_TIME = "5";
	/**
	 * 等待退款
	 */
	String WAIT_REFUND = "6";

	/**
	 * 已退款
	 */
	String REFUNDED = "7";

	/**
	 * 已取消
	 */
	String CANCELED = "8";


	/**
	 * 未完成
	 */
	String UNFINISHED = "9";

}
