package com.mei.creationalpatterns.singletonpattern;

/**
 * SingletonPatternEntryTwo
 * 单例模式示例  -- 懒汉式
 * createInstance() 方法使用 synchronized 关键字进行同步，确保线程安全
 * 无锁状态下是线程不安全的 优点是避免了内存浪费 缺点是效率低
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午11:36
 */
@SuppressWarnings("InstantiationOfUtilityClass")
public class SingletonPatternEntryTwo {

    // 私有化构造函数
    private SingletonPatternEntryTwo() {}

    // 定义 SingletonPatternEntry 的单例对象
    private static SingletonPatternEntryTwo instance;

    public static synchronized SingletonPatternEntryTwo createInstance() {
        if(instance == null) {
            instance = new SingletonPatternEntryTwo();
        }
        return instance;
    }

    // 类行为
    public void doSomething() {
        System.out.println("do something");
    }
}
