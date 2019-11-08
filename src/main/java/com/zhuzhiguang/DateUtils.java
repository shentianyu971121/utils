package com.zhuzhiguang;

import java.util.Date;

/**
 * 
 * @author zhuzg
 *
 */
public class DateUtils {
	
	/**
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int compare(Date date1,Date date2) {
		
		if(date1 == null|| date2== null)
			throw new RuntimeException("参数不能为空"  );
		
		return date1.compareTo(date2);
	}
}
