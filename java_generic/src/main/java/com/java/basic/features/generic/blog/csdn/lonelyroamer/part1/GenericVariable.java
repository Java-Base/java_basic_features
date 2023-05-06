package com.java.basic.features.generic.blog.csdn.lonelyroamer.part1;

import java.io.Serializable;

/**
 * 泛型变量的类型限定
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/1/17
 */
public class GenericVariable {

    /**
     * 类型限定在泛型类、泛型接口和泛型方法中都可以使用，不过要注意下面几点：
     * 1、不管该限定是类还是接口，统一都使用关键字 extends
     * 2、可以使用&符号给出多个限定
     * 3、如果限定既有接口也有类，那么类必须只有一个，并且放在首位置
     */


    public static <T extends Comparable & Serializable> T get(T t1, T t2) {
        if (t1.compareTo(t2) >= 0) {
            return t1;
        }

        return t2;
    }
}
