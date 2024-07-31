package com.mei.creationalpatterns.builderpattern.pack;

/**
 * Wrapper
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:24
 */
public class Wrapper implements Packing {
    @Override
    public String packName() {
        return "纸质包装";
    }
}
