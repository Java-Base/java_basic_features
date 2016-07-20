package com.java.basic.features.array;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年7月20日
 *
 */
public class ArrayUtilTest {

	private ArrayUtil arrayUtil = null;

	@Before
	public void setUp() {
		arrayUtil = new ArrayUtil();
	}

	@Test
	public void testFindDifferentElementsBetweenTwoArrays() {
		int[] arrayA = {1, 3, 5, 7, 9, 8, 10};
		int[] arrayB = {2, 4, 6, 8, 10, 3, 5};
		arrayUtil.findDifferentElementsBetweenTwoArrays(arrayA, arrayB);
	}

}
