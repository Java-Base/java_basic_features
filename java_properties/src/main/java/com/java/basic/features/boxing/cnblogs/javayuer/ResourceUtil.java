package com.java.basic.features.boxing.cnblogs.javayuer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取properties文件中的数据
 * 
 * 
 * @url		http://www.cnblogs.com/javayuer/archive/2011/01/02/1924192.html
 * @author 	Lian
 * @time	2016年8月10日
 */
public final class ResourceUtil {

	private ResourceUtil() {
	}

	public static Properties getProperties(String path) {
		InputStream inputStream;
		Properties properties = new Properties();
		try {
			/**
			 * 如果path以‘／’开头，从CLASSPATH根目录下获取资源
			 * 否则在此类所在的包下获取资源
			 */
			inputStream = ResourceUtil.class.getResourceAsStream(path);
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}

}
