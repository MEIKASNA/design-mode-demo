package com.mei.structuralpatterns.bridgepattern.shape;

import com.mei.structuralpatterns.bridgepattern.color.Color;

/**
 * Shape
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午5:49
 */
public abstract class Shape {

    Color color;

    // 抽象的绘画方法
    abstract void draw();
}
