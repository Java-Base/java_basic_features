package com.java.basic.features.generic.blog.csdn.lonelyroamer.part2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * 区分原始类型和泛型变量的类型
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/1/17
 */
public class RawTypeAndGenericVariable {

    /**
     * 在调用泛型方法的时候，可以指定泛型，也可以不指定泛型。
     * 在不指定泛型的情况下，泛型变量的类型为 该方法中的几种类型的同一个父类的最小级，直到Object。
     * 在指定泛型的时候，该方法中的几种类型必须是该泛型实例类型或者其子类。
     */


    public static void main(String[] args) {

        /**
         *  不指定泛型的时候
         */
        {
            // 这两个参数都是Integer, 所以T为Integer类型
            Integer resultInteger = RawTypeAndGenericVariable.add(1, 2);
            System.out.println("resultInteger[" + resultInteger + "]class[" + resultInteger.getClass() + "]");

            // 这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Number
            Number resultNumber = RawTypeAndGenericVariable.add(1, 1.2);
            System.out.println("resultNumber[" + resultNumber + "]class[" + resultNumber.getClass() + "]");

            //这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Object
            Object resultObject = RawTypeAndGenericVariable.add(1, "asd");
            System.out.println("resultObject[" + resultObject + "]class[" + resultObject.getClass() + "]");
            // 但实际上Serializable接口也可以
            Serializable resultSerializable = RawTypeAndGenericVariable.add(2, "abc");
            System.out.println("resultSerializable[" + resultSerializable + "]class[" + resultSerializable.getClass() + "]");
        }


        /**
         * 指定泛型的时候
         */
        {
            int a=RawTypeAndGenericVariable.<Integer>add(1, 2);//指定了Integer，所以只能为Integer类型或者其子类
//            int b=RawTypeAndGenericVariable.<Integer>add(1, 2.2);//编译错误，指定了Integer，不能为Float
            Number c=RawTypeAndGenericVariable.<Number>add(1, 2.2); //指定为Number，所以可以为Integer和Float

        }


        /**
         * 泛型类中, 不指定泛型的时候, 和上面的差不多
         * 只不过这个时候的泛型类型为Object，就比如ArrayList中，如果不指定泛型，那么这个ArrayList中可以放任意类型的对象。
         */
        {

            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            arrayList.add("abd");
            arrayList.add(new Date());

            for (Object obj : arrayList) {
                System.out.println("obj[" + obj + "]class[" + obj.getClass() + "]");
            }

        }
    }


    public static <T> T add(T x, T y ) {

        return y;
    }
}
