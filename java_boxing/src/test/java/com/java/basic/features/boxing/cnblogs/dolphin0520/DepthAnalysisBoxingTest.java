package com.java.basic.features.boxing.cnblogs.dolphin0520;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年8月10日
 */
public class DepthAnalysisBoxingTest {
	private DepthAnalysisBoxing record;

	@Before
	public void setUp() {
		record = new DepthAnalysisBoxing();
		System.out.println("\n*************set up");
	}

	@After
	public void tearDown() {
		System.out.println("*************tear down\n");
	}

	@Test
	public void testIntegerBoxing() {
		record.integerBoxing();
	}

	@Test
	public void testDoubleBoxing() {
		record.doubleBoxing();
	}

	@Test
	public void testBooleanBoxing() {
		record.booleanBoxing();
	}

	@Test
	public void testIntegrateBoxing() {
		record.integrateBoxing();
	}

}
