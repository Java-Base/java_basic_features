package com.java.basic.features.junit.cnblog.mengdd;

import static org.junit.Assert.assertEquals;

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
public class CalculatorTest {

	private Calculator calculator = null;

	/**
	 * 所以对代码进行重构，将重复的生成对象的部分放在setUp()方法中
	 * 重写的时候将protected变为public，继承的时候扩大访问范围是没有问题的。
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("set up");
		// 生成成员变量的实例
		// 注意：这里为每一个测试用例都会生成新的对象
		calculator = new Calculator();
		System.out.println(calculator);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear down");
	}

	/**
	 * Test method for {@link com.java.basic.features.junit.cnblog.mengdd.Calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		int result = calculator.add(1, 2);
		// 判断方法的返回结果
		assertEquals(3, result); // 第一个参数是期望值，第二个参数是要验证的值
	}

	/**
	 * Test method for {@link com.java.basic.features.junit.cnblog.mengdd.Calculator#subtract(int, int)}.
	 */
	@Test
	public void testSubtract() {
		int result = calculator.subtract(1, 2);
		// 判断方法的返回结果
		assertEquals(-1, result);// 第一个参数是期望值，第二个参数是要验证的值
	}

	/**
	 * Test method for {@link com.java.basic.features.junit.cnblog.mengdd.Calculator#multiply(int, int)}.
	 */
	@Test
	public void testMultiply() {
		int result = calculator.multiply(2, 3);
		// 判断方法的返回结果
		assertEquals(6, result);// 第一个参数是期望值，第二个参数是要验证的值
	}

	/**
	 * Test method for {@link com.java.basic.features.junit.cnblog.mengdd.Calculator#divide(int, int)}.
	 */
	@Test
	public void testDivide() {
		int result = calculator.divide(12, 3);
		// 判断方法的返回结果
		assertEquals(4, result);// 第一个参数是期望值，第二个参数是要验证的值
	}

}
