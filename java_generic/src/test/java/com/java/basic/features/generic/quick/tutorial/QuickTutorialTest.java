package com.java.basic.features.generic.quick.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * QuickTutorials Test
 *
 * @auth 	Lian
 * @date 	2016/9/28
 * @since 	1.0
 */
public class QuickTutorialTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before***************");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After***************");
	}

	@Test
	public void testMotivation() {
		Apple apple = QuickTutorial.motivation("apple");
		assertEquals("apple", apple.getName());
	}
}
