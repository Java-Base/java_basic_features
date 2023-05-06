package com.java.basic.features.generic.blog.csdn.sunwei2012.a_normal_generic;

/**
 * 两个泛型类型的泛型类
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/3/6
 */
public class GenericsDemo09 {

    public static void main(String[] args) {

        Notepad<String, Integer> t = new Notepad<>();      // 定义两个泛型类型的对象
        t.setKey("lian");
        t.setValue(22);

        System.out.println("姓名:" + t.getKey());
        System.out.println("年龄:" + t.getValue());

    }
}

/**
 * 此处定义了两个泛型类型,
 * 以此类推可以定义多个泛型类型
 * @param <K>
 * @param <V>
 */
class Notepad<K, V> {

    private K key;      // 此变量的类型由外部决定
    private V value;    // 此变量的类型由外部决定

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
