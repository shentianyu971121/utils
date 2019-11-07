package com.zhuzhiguang;

/**
 * 字符串工具类
 * @author zhuzg
 *
 */
public class StringUtils {
	
	/**
	 * 判断一个字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		
		return (str == null|| str.trim().equals(""));
	}
	
	

}
