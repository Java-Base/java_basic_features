package com.java.basic.features.boxing.blog.csdn.u011726984;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年7月20日
 *
 */
public class BoxingExampleTest {

	private BoxingExample boxingExample = null;

	@Before
	public void setUp() {
		boxingExample = new BoxingExample();
	}

	@After
	public void tearDown() {
		System.out.println("*************tear down");
	}

	/**
	 * Test method for {@link com.java.basic.features.boxing.blog.csdn.u011726984.BoxingExample#boxingTest()}.
	 */
	@Test
	public void testBoxingTest() {
		boxingExample.boxingTest();
	}

	/**
	 * Test method for {@link com.java.basic.features.boxing.blog.csdn.u011726984.BoxingExample#unboxingTest()}.
	 */
	@Test
	public void testUnboxingTest() {
		boxingExample.unboxingTest();
	}

	/**
	 * Test method for {@link com.java.basic.features.boxing.blog.csdn.u011726984.BoxingExample#unboxingTest2()}.
	 */
	@Test
	public void testUnboxingTest2() {
		boxingExample.unboxingTest2();
	}

	/**
	 * Test method for {@link com.java.basic.features.boxing.blog.csdn.u011726984.BoxingExample#comprehensiveTest()}.
	 */
	@Test
	public void testComprehensiveTest() {
		boxingExample.comprehensiveTest();
	}

}
