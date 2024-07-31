package com.mei.creationalpatterns.builderpattern.food;

/**
 * Cola
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:33
 */
public class Cola extends Drink{
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public float price() {
        return 10;
    }
}
