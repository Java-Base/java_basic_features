package com.java.basic.features.generic.quick.tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * Java泛型简明教程. 原文只翻译了一半。。
 * 
 * @url		http://www.vaikan.com/java-generics-quick-tutorial/
 * @origin	https://www.javacodegeeks.com/2011/04/java-generics-quick-tutorial.html
 *
 * @author 	Lian
 * @time	2016年8月10日
 */
public class QuickTutorial {

	/**
	 * Java泛型由来的动机.
	 * 理解Java泛型最简单的方法是把它看成一种便捷语法，能节省你某些Java类型转换(casting)上的操作
	 */
	public static Apple motivation(String name) {
		List<Apple> box = new ArrayList<Apple>();
		box.add(new Apple(name));

		return box.get(0);
	}

	/**
	 * 泛型类型跟其是否子类型没有任何关系。
	 */
	public static void genericSubClass() {

		List<Apple> apples = new ArrayList<>();
		/**
		 * Incompatible types
		 */
//		List<Fruit> fruits = apples;

		List<Fruit> fruits = new ArrayList<>();
		/**
		 * Incompatible types
		 */
//		apples = fruits;
	}

	public static void wildcard() {
		List<Apple> apples = new ArrayList<>();
		List<? extends Fruit> fruits = apples;

		List<Fruit> _fruits = new ArrayList<>();
		List<? super Apple> _list = _fruits;
	}

	public static void wildcardExtendsTest() {
		List<Apple> apples = new ArrayList<>();
		List<? extends Fruit> fruits = apples;

		/**
		 * all compile error
		 *
		 * 不能够往一个使用了? extends的数据结构里写入任何的值。
		 */
		/**
		 * 原因非常的简单，你可以这样想：这个? extends T 通配符告诉编译器我们在处理一个类型T的子类型，但我们不知道这个子类型究竟是什么。
		 * 因为没法确定，为了保证类型安全，我们就不允许往里面加入任何这种类型的数据。
		 * 另一方面，因为我们知道，不论它是什么类型，它总是类型T的子类型，当我们在读取数据时，能确保得到的数据是一个T类型的实例
		 */
//		fruits.add(new Strawberry("strawberry"));
//		fruits.add(new Apple("apple"));
//		fruits.add(new Fruit());

		/**
		 * 保证每次读取数据时，得到的数据为Fruit
		 */
		Fruit get = fruits.get(0);
	}

	public static void wildcardSuperTest() {
		List<Fruit> fruits = new ArrayList<>();
		List<? super Apple> superApples= fruits;

		superApples.add(new Apple("apple"));
		superApples.add(new FujiApple("fujiapple"));

		/**
		 * compile error
		 */
//		superApples.add(new Fruit());

		Object apple = superApples.get(0);
	}
}



