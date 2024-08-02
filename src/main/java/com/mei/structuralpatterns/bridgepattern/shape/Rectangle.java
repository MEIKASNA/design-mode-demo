package com.mei.structuralpatterns.bridgepattern.shape;

import com.mei.structuralpatterns.bridgepattern.color.Color;

/**
 * Rectangle 矩形
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午5:50
 */
public class Rectangle extends Shape {

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.println("draw rectangle");
    }
}
