package com.mei.creationalpatterns.factorypattern;

import com.mei.creationalpatterns.factorypattern.factory.DefaultProductFactory;
import com.mei.creationalpatterns.factorypattern.factory.ProductFactory;
import com.mei.creationalpatterns.factorypattern.product.DefaultProduct;

/**
 * Main
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午10:48
 */
public class Entrance
{
    public static void main(String[] args) {
        // 创建工厂
        ProductFactory productFactory = new ProductFactory();
        // 创建微信产品
        DefaultProduct wechat = productFactory.createProduct(DefaultProductFactory.ProductType.WECHAT);
        wechat.doSomething();
        // 创建支付宝产品
        DefaultProduct zfb = productFactory.createProduct(DefaultProductFactory.ProductType.ZFB);
        zfb.doSomething();
    }
}
