package com.java.basic.features.generic.quick.tutorial;

/**
 * @auth Lian
 * @date 2016/9/28
 */
public class FujiApple extends Apple {

	private String name;

	public FujiApple(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
