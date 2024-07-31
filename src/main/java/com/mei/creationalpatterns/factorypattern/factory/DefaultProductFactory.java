package com.mei.creationalpatterns.factorypattern.factory;

import com.mei.creationalpatterns.factorypattern.product.DefaultProduct;

/**
 * DefaultProductFactory
 * 抽象工厂类 定义了工厂的行为 规范化产品的创建过程
 *
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午10:49
 */
public interface DefaultProductFactory {

    // 定义创建产品的行为
    DefaultProduct createProduct(ProductType productType);

    public enum ProductType {
        WECHAT,
        ZFB;
    }
}

