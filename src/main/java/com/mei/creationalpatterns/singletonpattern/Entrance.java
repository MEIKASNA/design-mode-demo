package com.mei.creationalpatterns.singletonpattern;

/**
 * Entrance
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午11:42
 */
public class Entrance {
    public static void main(String[] args) {
        Singleton.INSTANCE.doSomething();
        SingletonPatternEntryOne.createInstance().doSomething();
        SingletonPatternEntryTwo.createInstance().doSomething();
    }
}
