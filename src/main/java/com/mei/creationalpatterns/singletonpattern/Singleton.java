package com.mei.creationalpatterns.singletonpattern;

/**
 * Singleton
 *  单例模式 -- 枚举实现
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午11:32
 */
public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("do something");
    }
}
