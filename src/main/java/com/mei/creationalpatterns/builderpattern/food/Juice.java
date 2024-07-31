package com.mei.creationalpatterns.builderpattern.food;

/**
 * Juice
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:30
 */
public class Juice extends Drink{
    @Override
    public String name() {
        return "果汁";
    }

    @Override
    public float price() {
        return 15;
    }
}
