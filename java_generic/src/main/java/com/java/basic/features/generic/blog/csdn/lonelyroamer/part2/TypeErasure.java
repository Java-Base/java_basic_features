package com.java.basic.features.generic.blog.csdn.lonelyroamer.part2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @version 1.0
 * @user lianxinzhong
 * @date 2019/2/19
 */
public class TypeErasure {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        /**
         * 在这个例子中，我们定义了两个ArrayList数组，不过一个是ArrayList<String>泛型类型，只能存储字符串。
         * 一个是ArrayList<Integer>泛型类型，只能存储整形。
         * 最后，我们通过arrayList1对象和arrayList2对象的getClass方法获取它们的类的信息，最后发现结果为true。
         * 说明泛型类型String和Integer都被擦除掉了，只剩下了原始类型。
         */
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("abd");

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(2);

        System.out.println(arrayList1.getClass() == arrayList2.getClass());


        /**
         * 在程序中定义了一个ArrayList泛型类型实例化为Integer的对象，如果直接调用add方法，那么只能存储整形的数据。
         * 不过当我们利用反射调用add方法的时候，却可以存储字符串。这说明了Integer泛型实例在编译之后被擦除了，只保留了原始类型。
         */

        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList3.add(3);
        arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "abd");

        for (int i = 0; i < arrayList3.size(); i++) {
            System.out.println(arrayList3.get(i));
        }
    }
}
