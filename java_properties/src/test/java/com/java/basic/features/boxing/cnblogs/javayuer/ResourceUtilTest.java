package com.java.basic.features.boxing.cnblogs.javayuer;

import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年8月10日
 */
public class ResourceUtilTest {

	/**
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetProperties() {
		Properties properties = ResourceUtil.getProperties("/RedisPoolSetting.properties");
		System.out.println(properties);
	}

}
