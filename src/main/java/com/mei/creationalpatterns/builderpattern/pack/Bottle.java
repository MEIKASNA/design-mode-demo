package com.mei.creationalpatterns.builderpattern.pack;

/**
 * Bottle
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:25
 */
public class Bottle implements Packing {
    @Override
    public String packName() {
        return "瓶装";
    }
}
