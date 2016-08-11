package com.java.basic.features.generic.quick.tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * Java泛型简明教程
 * 
 * @url		http://www.vaikan.com/java-generics-quick-tutorial/
 * @origin	https://www.javacodegeeks.com/2011/04/java-generics-quick-tutorial.html
 * @author 	Lian
 * @time	2016年8月10日
 */
@SuppressWarnings("unused")
public class QuickTutorial {

	/**
	 * Java泛型由来的动机.
	 * 理解Java泛型最简单的方法是把它看成一种便捷语法，能节省你某些Java类型转换(casting)上的操作
	 */
	private static void motivation() {
		List<Apple> box = new ArrayList<Apple>();
		box.add(new Apple("apple"));

		Apple apple = box.get(0);
	}

	/**
	 * 泛型的构成
	 * 由泛型的构成引出了一个类型变量的概念。根据Java语言规范，类型变量是一种没有限制的标志符，产生于以下几种情况：
	 *	泛型类声明
	 *	泛型接口声明
	 *	泛型方法声明
	 *	泛型构造器(constructor)声明
	 */
	private static void facility() {
	}

}


class Apple {
	String name;

	public Apple(String name) {
		this.name = name;
	}
}
