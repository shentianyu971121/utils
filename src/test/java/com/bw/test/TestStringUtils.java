package com.bw.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zhuzhiguang.StringUtils;

public class TestStringUtils {
	
	@Test
	public void testIsBlank() {
		
		
		// ¶ÏÑÔ  Õæ
		assertTrue( StringUtils.isBlank("   "));
		
	}
	
	
	@Test
	public void testIsBlank2() {
		//¶ÏÑÔ ¼Ù
		assertFalse( StringUtils.isBlank("aaaa"));
	}
	
	
}
