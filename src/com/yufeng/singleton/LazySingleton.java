package com.yufeng.singleton;

public class LazySingleton {
    /*装载对象的时候不创建对象实例*/
    private static LazySingleton instance = null;
    /**
     * 私有默认构造子
     */
    private LazySingleton(){}

    /**
     * 静态工厂方法
     */

    private static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
