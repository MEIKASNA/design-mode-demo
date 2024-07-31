package com.mei.creationalpatterns.factorypattern.product;

/**
 * WeChatProduct
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午10:55
 */
public class WeChatProduct implements DefaultProduct {

    @Override
    public void doSomething() {
        // 使用微信产品进行付款 do something with WeChat product
        System.out.println("使用微信付款");
    }
}
