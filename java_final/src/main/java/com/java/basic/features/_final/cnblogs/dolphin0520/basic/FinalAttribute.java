package com.java.basic.features._final.cnblogs.dolphin0520.basic;

/**
 * 对于一个final变量
 *   如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；
 *   如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。
 *
 * @author 	Lian
 * @date	2016年8月11日
 * @since 	1.0
 */
@SuppressWarnings("unused")
public class FinalAttribute {

	private final int i = 0;

	public FinalAttribute() {
		/**
		 * Compile error: The final field FinalAttribute.i cannot be assigned
		 */
//		i = 1;

		final Object obj = new Object();
		/**
		 * Compile error: The final local variable obj cannot be assigned. It must be blank and not using a compound assignment
		 */
//		obj = new Object();
	}
}
