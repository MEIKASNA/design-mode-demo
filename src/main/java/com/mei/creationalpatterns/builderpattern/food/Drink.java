package com.mei.creationalpatterns.builderpattern.food;

import com.mei.creationalpatterns.builderpattern.pack.Bottle;
import com.mei.creationalpatterns.builderpattern.pack.Packing;

/**
 * Drink
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:30
 */
public abstract class Drink implements Food{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
