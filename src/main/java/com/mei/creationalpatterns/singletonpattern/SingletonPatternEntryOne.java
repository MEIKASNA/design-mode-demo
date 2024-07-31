package com.mei.creationalpatterns.singletonpattern;

/**
 * SingletonPatternEntry
 *  单例模式示例  -- 饿汉式
 *  这种方式比较简单，在类被加载时就完成实例化，所以叫做饿汉式。
 *  这种方法会产生一些垃圾对象， 由于在类加载时就实例化
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午11:22
 */
public class SingletonPatternEntryOne {

    // 私有化构造函数
    private SingletonPatternEntryOne() {}

    // 创建 SingletonPatternEntry 的单例对象
    private static final SingletonPatternEntryOne instance = new SingletonPatternEntryOne();

    // 提供一个静态方法，用于获取 SingletonPatternEntry 的单例对象
    public static SingletonPatternEntryOne createInstance() {
        return instance;
    }

    // 类行为
    public void doSomething() {
        System.out.println("do something");
    }
}
