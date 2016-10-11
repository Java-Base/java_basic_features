package com.java.basic.features._final.cnblogs.dolphin0520.basic;

/**
 * 当用final修饰一个类时，表明这个类不能被继承。
 * final类中的成员变量可以根据需要设为final，但是要注意final类中的所有成员方法都会被隐式地指定为final方法。
 * 在使用final修饰类的时候，要注意谨慎选择，除非这个类真的在以后不会用来继承或者出于安全的考虑，尽量不要将类设计为final类。
 *
 * @author 	Lian
 * @time	2016年8月11日
 */
//public class FinalClass extends People {
public final class FinalClass {

	private String name;
	private final String addr;
	private final static String phone;

	/**
	 * init final static field in the static block
	 */
	static {
		phone = "";
	}


	public FinalClass() {
		/**
		 * init final field in the constructor method
		 * also can init when it define
		 */
		addr = "";
	}

}

/**
 * Compile error: cannot inherit from final class
 */
//class People extends FinalClass{
//}

