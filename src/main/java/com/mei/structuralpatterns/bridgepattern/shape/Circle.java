package com.mei.structuralpatterns.bridgepattern.shape;

import com.mei.structuralpatterns.bridgepattern.color.Color;

/**
 * Circle 圆形
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午5:51
 */
public class Circle extends Shape{

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        // 画出形状
        System.out.println("Drawing Circle");
    }
}
