package com.java.basic.features._final.cnblogs.dolphin0520.deep;

/**
 * 当用final作用于类的成员变量时，成员变量（注意是类的成员变量，局部变量只需要保证在使用之前被初始化赋值即可）必须在定义时或者构造器中进行初始化赋值，
 * 而final变量一旦被初始化赋值之后，就不能再被赋值了。
 *
 * @author 	Lian
 * @time	2016年8月11日
 */
public class FinalVariable {

	/**
	 * 当final变量是基本数据类型以及String类型时，如果在编译期间能知道它的确切值，则编译器会把它当做编译期常量使用。
	 * 也就是说在用到该final变量的地方，相当于直接访问的这个常量，不需要在运行时确定
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "hello2";
		final String b = "hello";
		String c = "hello";

		String d = b + 2;
		System.out.println((a == d));

		System.out.println("******************");

		String e = c + 2;
		System.out.println((a == e));

		System.out.println("******************");

		String f = "hello" + 2;
		System.out.println((a == f));

		System.out.println("******************");

		String g = getHello() + 2;
		System.out.println((a == g));
	}

	public static String getHello() {
		return "hello";
	}
}
