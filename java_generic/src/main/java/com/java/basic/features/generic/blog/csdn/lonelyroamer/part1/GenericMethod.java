package com.java.basic.features.generic.blog.csdn.lonelyroamer.part1;

import org.apache.log4j.Logger;

/**
 * 泛型方法的定义和使用
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/1/17
 */
public class GenericMethod {

    private static final Logger logger = Logger.getLogger(GenericMethod.class);


    /**
     * 泛型类在多个方法签名间实施类型约束。
     * 在 List<V> 中，类型参数 V 出现在 get()、add()、contains() 等方法的签名中。
     * 当创建一个 Map<K, V> 类型的变量时，您就在方法之间宣称一个类型约束。您传递给 add() 的值将与 get() 返回的值的类型相同。
     *
     * 类似地，之所以声明泛型方法，一般是因为您想要在该方法的多个参数之间宣称一个类型约束。
     */


    public static <T, U> T get(T t, U u) {
        if ( u!= null) {
            return t;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String str = get("Hello", "World");
        logger.info(str);
    }
}
