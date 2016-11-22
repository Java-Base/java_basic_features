package com.java.basic.features.boxing.cnblogs.dolphin0520;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * BoxingExample测试类
 *
 * @author 	Lian
 * @time	2016年7月20日
 * @since 	1.0
 */
public class BoxingExampleTest {

	private BoxingExample boxingExample = null;

	@Before
	public void setUp() {
		boxingExample = new BoxingExample();
		System.out.println("\n*************set up");
	}

	@After
	public void tearDown() {
		System.out.println("*************tear down\n");
	}

	/**
	 * Test method for {@link BoxingExample#boxingTest()}.
	 */
	@Test
	public void testBoxingTest() {
		boxingExample.boxingTest();
	}

	/**
	 * Test method for {@link BoxingExample#unboxingTest()}.
	 */
	@Test
	public void testUnboxingTest() {
		boxingExample.unboxingTest();
	}

	/**
	 * Test method for {@link BoxingExample#comprehensiveTest()}.
	 */
	@Test
	public void testComprehensiveTest() {
		boxingExample.comprehensiveTest();
	}

}
