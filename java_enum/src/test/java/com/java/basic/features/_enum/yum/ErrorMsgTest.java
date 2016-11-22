package com.java.basic.features._enum.yum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * $
 *
 * @author 	Lian
 * @date 	2016/11/22
 * @since 	1.0
 */
public class ErrorMsgTest {

	@Before
	public void setUp() {
		System.out.println("\n*************set up");
	}

	@After
	public void tearDown() {
		System.out.println("*************tear down\n");
	}

	@Test
	public void test() {
		System.out.println(ErrorMsg.ACCEPT_COUPON_MERCHANT_POSID_INVALID.getErrorCode());
		System.out.println(ErrorMsg.ACCEPT_COUPON_MERCHANT_POSID_INVALID.getErrorMsg());
	}
}
