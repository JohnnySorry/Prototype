package com.yufeng.singleton;

/**
 * 饿汉式单例
 * */
public class EagerSingleton {

    /**
     * 装载类的时候就创建对象实例
     * */
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 私有默认构造因子
     *
     * */
    private EagerSingleton(){}

    /**
     *静态工厂方法
     * */
    public static EagerSingleton getInstance(){
        return instance;
    }
}
