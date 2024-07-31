package com.mei.creationalpatterns.builderpattern.food;

/**
 * VegBurger
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:28
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 30;
    }
}
