package com.java.basic.features.cnblogs;

/**
 * Java中Class类详解、用法及泛化
 * https://www.cnblogs.com/bethunebtj/p/4680532.html
 *
 * @version 1.0
 * @user lianxinzhong
 * @date 2019/4/16
 */
public class ClassTest1 {

    public static void main(String[] args) {

        ClassTest1 ct = new ClassTest1();
        ct.getClassObject();


//        ct.generateTargetClassInstance();
    }


    /**
     * 获取一个Class对象
     */
    public void getClassObject() {

    //        String str1 = new String("aaa");
        try {
    //            Class StringClass = Class.forName("java.lang.String");
            Class c = Class.forName("com.java.basic.features.cnblogs.Shapes");
            System.out.println(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Shapes s = new Shapes();
        Class obj1 = s.getClass();
        System.out.println(obj1);

        // 这种方法不会使JVM自动加载该类, 而上面两种方法会使得JVM初始化类
        Class class3 = Shapes.class;
        System.out.println(class3);
    }

    /**
     * 使用Class类的对象来生成目标类的实例
     */
    public void generateTargetClassInstance() {

        /*
         * 生成不精确的object实例
         * 获取一个Class类的对象后，可以用 newInstance() 函数来生成目标类的一个实例。然而，该函数并不能直接生成目标类的实例，只能生成object类的实例
         */
        try {
            Class c = Class.forName("com.java.basic.features.cnblogs.Shapes");
            Object obj = c.newInstance();
            obj.toString();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        /**
         * 使用泛化Class引用生成带类型的目标实例
         */
        try {
            Class<Shapes> shapes = Shapes.class;
            Shapes shapesInstance = shapes.newInstance();
            shapesInstance.toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }


}

class Shapes {
    @Override
    public String toString() {

        System.out.println("override toString()");
        return "Shapes override toString()";
    }
}
