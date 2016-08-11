package com.java.basic.features._final.cnblogs.dolphin0520.basic;

/**
 * 只有在想明确禁止 该方法在子类中被覆盖的情况下才将方法设置为final
 * 类的private方法会隐式地被指定为final方法
 *
 * @author 	Lian
 * @time	2016年8月11日
 */
public class FinalMethod extends Person {

	/**
	 * 可重写的方法只有run（）方法
	 */
	@Override
	void run() {
		System.out.println("FinalMethod run...");
	}

}

class Person {
	final void say() {
		System.out.println("Person say...");
	}

	@SuppressWarnings("unused")
	private void sing() {
		System.out.println("Person sing...");
	}

	void run() {
		System.out.println("Person run...");
	}
}
