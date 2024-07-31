package com.mei.creationalpatterns.builderpattern.food;

import com.mei.creationalpatterns.builderpattern.pack.Packing;

/**
 * Food
 *  食物接口
 * @author MEI
 * @version v0.1
 * 2024年07月31日 下午3:22
 */
public interface Food {
    public String name(); // 食物名称
    public Packing packing(); // 食物包装
    public float price(); // 食物价格
}
