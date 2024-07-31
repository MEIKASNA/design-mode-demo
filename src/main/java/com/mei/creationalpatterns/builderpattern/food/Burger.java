package com.mei.creationalpatterns.builderpattern.food;

import com.mei.creationalpatterns.builderpattern.pack.Wrapper;
import com.mei.creationalpatterns.builderpattern.pack.Packing;

/**
 * Burger
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:26
 */
public abstract class Burger implements Food{

    @Override
    public Packing packing() {
        return new Wrapper(); // 纸质包装
    }
}

