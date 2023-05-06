package com.java.basic.features.generic.blog.csdn.sunwei2012.c_limit_generic;

import com.java.basic.features.generic.blog.csdn.sunwei2012.data.Info;

/**
 * 受限泛型
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/3/6
 */
public class GenericsDemo17 {

    public static void main(String[] args) {

        Info<Integer> infoInteger = new Info<>();   // 声明Integer的泛型对象
        Info<Float> infoFloat = new Info<>();       // 声明Float的泛型对象

        infoInteger.setVar(22);         // 设置整数, 自动装箱
        infoFloat.setVar(33.33f);       // 设置小数, 自动装箱

        fun(infoInteger);
        fun(infoFloat);

    }

    public static void fun(Info<? extends Number> temp) {

        System.out.print(temp + " _ ");
    }
}
