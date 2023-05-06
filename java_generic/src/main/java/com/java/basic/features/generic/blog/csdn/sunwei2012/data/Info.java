package com.java.basic.features.generic.blog.csdn.sunwei2012.data;

/**
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/3/6
 */
public class Info<T> {

    private T var;      // 定义泛型变量

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    /**
     * 直接打印
     * @return
     */
    public String toString() {
        return this.var.toString();
    }
}
