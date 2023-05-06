package com.java.basic.features.generic.blog.csdn.lonelyroamer.part1;

import org.apache.log4j.Logger;

/**
 * @version 1.0
 * @user lianxinzhong
 * @date 2020/3/5
 */
public class GenericClass2<K, U> {

    private static final Logger logger = Logger.getLogger(GenericClass2.class);

    private K k;
    private U u;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }


    public static void main(String[] args) {

        GenericClass2<Integer, String> genericClass2 = new GenericClass2<Integer, String>();

        genericClass2.setK(1);
        genericClass2.setU("lian");

        logger.info(genericClass2.getK());
        logger.info(genericClass2.getU());

    }
}
