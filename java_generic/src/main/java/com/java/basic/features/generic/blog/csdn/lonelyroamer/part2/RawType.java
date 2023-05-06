package com.java.basic.features.generic.blog.csdn.lonelyroamer.part2;

/**
 * 类型擦除后保留的原始类型
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/1/17
 */
public class RawType<T> {

    /**
     * 原始类型（raw type）就是擦除去了泛型信息，最后在字节码中的类型变量的真正类型。
     * 无论何时定义一个泛型类型，相应的原始类型都会被自动地提供。
     * 类型变量被擦除（crased），并使用其限定类型（无限定的变量用Object）替换。
     */

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


