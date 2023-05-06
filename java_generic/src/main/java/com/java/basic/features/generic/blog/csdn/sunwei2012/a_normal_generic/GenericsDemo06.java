package com.java.basic.features.generic.blog.csdn.sunwei2012.a_normal_generic;

/**
 * 单个泛型类型的泛型类
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/3/6
 */
public class GenericsDemo06 {

    public static void main(String[] args) {

        Point<String> p = new Point<>();    // Point类中的var类型为String
        p.setVar("it");                     // 设置字符串

        System.out.println(p.getVar().length());
    }
}


/**
 * 普通泛型类
 * @param <T>   此处可以随便填写标识符, T是type的简称
 */
class Point<T> {

    private T var;      // var的类型由T指定, 即:由外部指定

    /**
     * 返回值的类型由外部决定
     * @return
     */
    public T getVar() {
        return var;
    }

    /**
     * 设置的类型也由外部决定
     * @param var
     */
    public void setVar(T var) {
        this.var = var;
    }
}