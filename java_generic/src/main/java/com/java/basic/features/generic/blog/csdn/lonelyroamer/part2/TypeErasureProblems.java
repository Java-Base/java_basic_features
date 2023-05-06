package com.java.basic.features.generic.blog.csdn.lonelyroamer.part2;

import java.util.ArrayList;

/**
 * 类型擦除引起的问题及解决方法
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/1/17
 */
public class TypeErasureProblems {


    /**
     * 先检查，在编译，以及检查编译的对象和引用传递的问题
     */
    public static void problemOfCheckCompileAndObjectReference() {

        /**
         * 参数化类型与原始类型的兼容
         */
        {
            /*
            以ArrayList举例子，以前的写法：

            ArrayList arrayList=new ArrayList();
            现在的写法：
            ArrayList<String>  arrayList=new ArrayList<String>();

            如果是与以前的代码兼容，各种引用传值之间，必然会出现如下的情况：
            ArrayList<String> arrayList1=new ArrayList(); //第一种 情况
            ArrayList arrayList2=new ArrayList<String>();//第二种 情况

            这样是没有错误的，不过会有个编译时警告。
            不过在第一种情况，可以实现与 完全使用泛型参数一样的效果，第二种则完全没效果。

            因为，本来类型检查就是编译时完成的。new ArrayList()只是在内存中开辟一个存储空间，可以存储任何的类型对象。
            而真正涉及类型检查的是它的引用，因为我们是使用它引用arrayList1 来调用它的方法，比如说调用add()方法。所以arrayList1引用能完成泛型类型的检查。
            */



            ArrayList<String> arrayList1=new ArrayList(); //第一种 情况
//            arrayList1.add(2);    // wrong
            arrayList1.add("abd");


            ArrayList arrayList2=new ArrayList<String>();//第二种 情况
            arrayList2.add(2);
        }

    }
}
