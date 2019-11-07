package com.bw.test;

import java.util.Date;

import org.junit.Test;

import com.zhuzhiguang.DateUtils;

public class TestDate {
	
	@Test
	public void testDate() {
		DateUtils.compare(null, new Date());
	}

}
