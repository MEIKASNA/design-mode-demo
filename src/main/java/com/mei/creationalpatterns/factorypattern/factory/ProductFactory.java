package com.mei.creationalpatterns.factorypattern.factory;

import com.mei.creationalpatterns.factorypattern.product.DefaultProduct;
import com.mei.creationalpatterns.factorypattern.product.WeChatProduct;
import com.mei.creationalpatterns.factorypattern.product.ZFBProduct;

/**
 * ProductFactory
 *  工厂类  用于获取具体的产品对象
 * @author MEI
 * @version v0.1
 * 2024年07月31日 上午10:42
 */
public class ProductFactory implements DefaultProductFactory{


    // 具体的创建产品的方法
    @Override
    public DefaultProduct createProduct(ProductType productType) {
        switch (productType) {
            case WECHAT -> {
                return new WeChatProduct();
            }
            case ZFB -> {
                return new ZFBProduct();
            }
            default -> {
                return null;
            }
        }
    }
}
