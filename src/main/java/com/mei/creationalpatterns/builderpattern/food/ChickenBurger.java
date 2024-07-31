package com.mei.creationalpatterns.builderpattern.food;

/**
 * ChickenBurger
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:29
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}
