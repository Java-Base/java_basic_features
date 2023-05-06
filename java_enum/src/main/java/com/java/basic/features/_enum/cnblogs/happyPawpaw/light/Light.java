package com.java.basic.features._enum.cnblogs.happyPawpaw.light;

public enum Light {

    /** 利用构造函数传参 */
    RED(1), GREEN(3), YELLOW(2);

    /** 定义私有变量 */
    private int colorCode;

    /** 构造函数, 枚举类型的构造函数只能为私有. 因此不用显示private定义 */
    Light(int _colorCode) {
        this.colorCode = _colorCode;
    }

    @Override
    public String toString() {
//        return super.toString();
        return String.valueOf(this.colorCode);
    }
}
