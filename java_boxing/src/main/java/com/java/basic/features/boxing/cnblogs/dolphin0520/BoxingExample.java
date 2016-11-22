package com.java.basic.features.boxing.cnblogs.dolphin0520;

/**
 * Java学习之自动装箱和自动拆箱源码分析
 * 装箱过程是通过调用包装器的valueOf方法实现的，而拆箱过程是通过调用包装器的 xxxValue方法实现的。（xxx代表对应的基本数据类型）。
 *
 * @url		http://www.cnblogs.com/dolphin0520/p/3780005.html
 * @author 	Lian
 * @date	2016年7月20日
 * @since 	1.0
 */
public class BoxingExample {

	/**
	 * 首先了解下Java的四类八种基本数据类型
	 * 基本类型	占用空间(Byte)	表示范围					包装器类型
	 * boolean	1/8				true|false				Boolean
	 * char		2				-128~127				Character
	 * bye		1				-128~127				Byte
	 * short	2				-2^15~2^15-1			Short
	 * int		4				-2^31~2^31-1			Integer
	 * long		8				-2^63~2^63-1			Long
	 * float	4				-3.403E38~3.403E38		Float
	 * double	8				-1.798E308~-1.798E308	Double
	 */

	/**
	 * Java中所谓的装箱通俗点就是: 八种基本数据类型在某些条件下使用时, 会自动变为对应的包装器类型
	 */
	public void boxingTest() {
		/**
		 * 将数字赋值给Integer对象，自动装箱。调用Integer.valueOf()方法。
		 * 下面四个赋值语句等价于：Integer var = Integer.valueOf(num);
		 * 而Integer.valueOf(num)方法中会缓存－128～127的Integer对象，具体查看源码
 		 */

		Integer i1 = 17;
		Integer i2 = 17;

		Integer i3= 137;
		Integer i4 = 137;


		/**
		 * 两边均为包装器类型，'==' 运算符比较对象的实际引用地址。i1与i2指向的是同一对象
		 */
		System.out.println(i1 == i2);	// true

		/**
		 * 两边均为包装器类型，'==' 运算符比较对象的实际引用地址。i3与i4指向的是不同对象
		 */
		System.out.println(i3 == i4);	// false

		/**
		 * 查看Integer.equals()源码得知，两个Integer对象最终比较的是值
		 */
		System.out.println(i1.equals(i2));	// true

		/**
		 * 查看Integer.equals()源码得知，两个Integer对象最终比较的是值
		 */
		System.out.println(i3.equals(i4));	// true
	}

	/**
	 * Java中所谓的拆箱通俗点就是: 八种包装器类型在某些条件下使用时, 会自动变为对应的基本数据类型
	 * 当包装器类型和基本数据类型调用'=='进行比较时, 会调用Integer.intValue方法自动拆箱包装器数据类型为基本数据类型
	 */
	public void unboxingTest() {
		Integer i1 = 17;
		int i2 = 17;

		int i3 = 137;
		Integer i4 = 137;

		System.out.println(i1 == i2);	// true

		System.out.println(i3 == i4);	// true
	}

	/**
	 * 综合测试
	 */
	public void comprehensiveTest() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;

		Long g = 3L;
		Long h = 2L;

		/**
		 * true
		 *
		 * 虽然“==”比较的是引用的是否是同一对象，但这里有算术运算，如果该引用为包装器类型则会导致自动拆箱
		 * 实际执行代码为：c.intValue() == a.intValue() + b.intValue()
 		 */
		System.out.println(c == (a + b));

		/**
		 * true
		 *
		 * equals 比较的是引用的对象的内容（值）是否相等，但这里有算术运算，如果该引用为包装器类型则会导致自动拆箱，再自动装箱
		 * a+b触发自动拆箱得到值后，再自动装箱与c比较
		 * 实际执行代码为：c.equals(Integer.valueOf(a.intValue() + b.intValue()))
 		 */
		System.out.println(c.equals(a + b));

		/**
		 * true
		 *
		 * 首先a+b触发自动拆箱后值为int型，所以比较的是值是否相等
		 * 实际执行代码为：g.longValue() == (long)(a.intValue() + b.intValue())
 		 */
		System.out.println(g == (a + b));

		/**
		 * false
		 *
		 * 首先a+b触发自动拆箱后值为int型，自动装箱后为Integer型，然后g为Long型
		 * 实际执行代码为：g.equals(Integer.valueOf(a.intValue() + b.intValue())
 		 */
		System.out.println(g.equals(a + b));

		/**
		 * true
		 *
		 * 首先a+h触发自动拆箱后值为long型，因为int型的a会自动转型为long型的g然后自动装箱后为Long型，而g也为Long型
		 * 实际执行代码为：g.equals(Long.valueOf((long)a.intValue() + h.longValue()))
 		 */
		System.out.println(g.equals(a + h));
	}

	/**
	 * 这里面需要注意的是:
	 * 当"=="运算符的两个操作数都是包装器类型的引用, 则是比较指向的是否是同一个对象, 
	 * 而如果其中有一个操作数是表达式(即包含算数运算)则比较的是数值(即会触发自动拆箱的过程)
	 * 另外, 对于包装器类型, equals方法并不会进行类型转换
	 */
}
