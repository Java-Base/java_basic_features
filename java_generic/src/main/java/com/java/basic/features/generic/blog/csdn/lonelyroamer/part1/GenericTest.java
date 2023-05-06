package com.java.basic.features.generic.blog.csdn.lonelyroamer.part1;

import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * @author ：LXZ
 * @date ：Created 2023/3/9 13:55
 */
public class GenericTest {
    private static final Logger logger = Logger.getLogger(GenericClass.class);

    public static void main(String[] args) {
        // 泛型类创建时没有指定泛型类型时. 默认类型为Object
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("String");
        for (int i = 0; i < list.size(); i++) {
            logger.info(list.get(i) + "\t" + list.get(i).getClass().getSimpleName());
        }

        logger.info("-----------------------------------------------------------------------");


        /**
         * 泛型类测试. 其中泛型类构造参数可以选择默认的无参
         */
        GenericClass<String, Integer> fruit = new GenericClass<>("梨子", 100);
        logger.info("fruit key: " + fruit.getKey() + "; fruit value: " + fruit.getValue());

        fruit.setKey("苹果");
        fruit.setValue(200);
        logger.info("fruit key: " + fruit.getKey() + ";fruit value: " + fruit.getValue());


        GenericClass<Integer, String> genericClass = new GenericClass<>();
        genericClass.setKey(1);
        genericClass.setValue("hello");
        logger.info("genericClass key: " + genericClass.getKey() + "; genericClass value: " + genericClass.getValue());
        genericClass.setKey(2);
        genericClass.setValue("world");
        logger.info("genericClass key: " + genericClass.getKey() + "; genericClass value: " + genericClass.getValue());


    }
}
