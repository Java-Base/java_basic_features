package com.java.basic.features.generic.blog.csdn.lonelyroamer.part1;


import org.apache.log4j.Logger;

/**
 * 泛型类的定义和使用
 * 一个泛型类（generic class）就是具有一个或多个类型变量的类。定义一个泛型类十分简单，只需要在类名后面加上<>，再在里面加上类型参数
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2019/2/19
 */
public class GenericClass<K, V> {

    private K key;
    private V value;

    public GenericClass() {
    }

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
