package com.java.basic.features._final.cnblogs.dolphin0520.deep;

/**
 * 很多时候会容易把static和final关键字混淆，
 *     static作用于成员变量用来表示只保存一份副本
 *     而final的作用是用来保证变量不可变
 *
 * @author 	Lian
 * @time	2016年8月11日
 */
public class FinalStatic {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MyClass2 myClass1 = new MyClass2();
		MyClass2 myClass2 = new MyClass2();

		System.out.println("myClass1 i : " + myClass1.i);
		System.out.println("myClass1 j : " + myClass1.j);

		System.out.println("myClass2 i : " + myClass2.i);
		System.out.println("myClass2 j : " + myClass2.j);
	}
}

class MyClass2 {
	public final double i = Math.random();
	public static double j = Math.random();
}