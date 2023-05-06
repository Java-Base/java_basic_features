package com.java.basic.features.generic.blog.csdn.sunwei2012.b_wild_card;

import com.java.basic.features.generic.blog.csdn.sunwei2012.data.Info;

/**
 * 通配符
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/3/6
 */
public class GenericsDemo14 {

    public static void main(String[] args) {

        Info<String> infoString = new Info<>();
        infoString.setVar("lian");
        fun(infoString);

        Info<Integer> infoInteger = new Info<>();
        infoInteger.setVar(22);
        fun(infoInteger);

    }

    public static void fun(Info<?> temp) {      // 可以接收任意的泛型对象
        System.out.println("内容: " + temp);
    }

}
