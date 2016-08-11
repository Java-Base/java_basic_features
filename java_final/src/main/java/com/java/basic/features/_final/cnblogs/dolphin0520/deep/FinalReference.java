package com.java.basic.features._final.cnblogs.dolphin0520.deep;

/**
 * 在上面提到被final修饰的引用变量一旦初始化赋值之后就不能再指向其他的对象,
 * 引用变量被final修饰之后，虽然不能再指向其他对象，但是它指向的对象的内容是可变的。
 *
 * @author 	Lian
 * @time	2016年8月11日
 */
public class FinalReference {

	public static void main(String[] args) {
		final MyClass myClass = new MyClass();
		System.out.println(++myClass.i);
	}
}

class MyClass {
	public int i = 0;
}