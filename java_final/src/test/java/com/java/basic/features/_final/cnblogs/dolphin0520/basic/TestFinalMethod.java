package com.java.basic.features._final.cnblogs.dolphin0520.basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年8月11日
 */
public class TestFinalMethod {
	private FinalMethod finalMethod;

	@Before
	public void setUp() throws Exception {
		finalMethod = new FinalMethod();
		System.out.println("\n************setup*************");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("************teardown*************\n");
	}

	@Test
	public void run() {
		finalMethod.run();
	}

	@Test
	public void say() {
		finalMethod.say();
	}
}
