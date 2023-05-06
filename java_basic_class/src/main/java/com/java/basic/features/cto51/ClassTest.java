package com.java.basic.features.cto51;

import org.apache.log4j.Logger;

/**
 * @author ：LXZ
 * @date ：Created 2022/9/8 13:38
 */
public class ClassTest {
    private final static Logger logger = Logger.getLogger(ClassTest.class);


    public static void main(String[] args) {
        String str = "aaa";

        logger.info("" + str.getClass().getClasses());
        logger.info("" + str.getClass().getClasses().getClass());
        logger.info("" + str.getClass().getClasses().getClass().getClasses());
        logger.info("" + str.getClass().getClasses().getClass().getClasses().getClass());

    }
}
