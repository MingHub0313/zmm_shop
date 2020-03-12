package com.github.zmm.shop.common.util;


import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Name Exceptions  异常工具类
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class Exceptions {

	/**
	 * 将CheckedException转换成UncheckedException.
	 * @param e
	 * @return
	 */
	public static RuntimeException unchecked(Exception e) {
		if(e instanceof RuntimeException) {
			return (RuntimeException) e;
		}else {
			return new RuntimeException(e);
		}
	}

	/**
	 * 将错误的堆栈转化为String
	 * @param e
	 * @return
	 */
	public static String getStackTraceToString(Throwable e) {
		if (e == null) {
			return "";
		}
		StringWriter stringWriter = new StringWriter();
		e.printStackTrace(new PrintWriter(stringWriter));
		return stringWriter.toString();
	}
}
