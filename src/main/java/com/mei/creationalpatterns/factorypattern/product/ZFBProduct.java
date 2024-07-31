package com.mei.creationalpatterns.factorypattern.product;

/**
 * ZFBProduct
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午10:55
 */
public class ZFBProduct implements DefaultProduct {

    @Override
    public void doSomething() {
        // 使用支付宝产品进行付款 do something with ZFB product
        System.out.println("使用ZFB付款");
    }
}
