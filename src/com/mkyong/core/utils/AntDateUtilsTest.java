package com.mkyong.core.utils;

import org.junit.Test;

import static org.junit.Assert.*;


public class AntDateUtilsTest {

	@Test
	public void test() {
		System.out.println("Inside TestAntDateUtils.test - START");
		DateUtils dateUtils = new DateUtils();
		String status = dateUtils.printTodatDate();
		assertEquals("success", status);
		System.out.println("Inside TestAntDateUtils.test - END");
	}

}
