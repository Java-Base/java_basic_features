package com.java.basic.features.generic.blog.csdn.lonelyroamer.part1;

import org.apache.log4j.Logger;

import java.util.Date;

/**
 * 泛型接口的定义和使用
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2019/2/19
 */
public class GenericInterface implements Show<String, Date> {

    private static final Logger logger = Logger.getLogger(GenericInterface.class);

    @Override
    public void show(String str, Date date) {
        logger.info(str);
        logger.info(date);
    }

    public static void main(String[] args) {
        GenericInterface genericInterface = new GenericInterface();
        genericInterface.show("Hello", new Date());
    }
}


/**
 * 泛型类可以有多个类型变量, 定义泛型接口和泛型类差不多
 * 注意：类型变量使用大写形式，且比较短，这是很常见的。
 * 在Java库中，使用变量E表示集合的元素类型，K和V分别表示关键字与值的类型。（需要时还可以用临近的字母U和S）表示“任意类型”。
 * @param <T>
 * @param <U>
 */
interface Show<T, U> {
    void show(T t, U u);
}

