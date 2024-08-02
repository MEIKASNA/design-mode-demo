package com.mei.structuralpatterns.bridgepattern;

import com.mei.structuralpatterns.bridgepattern.color.Blue;
import com.mei.structuralpatterns.bridgepattern.color.Red;
import com.mei.structuralpatterns.bridgepattern.shape.Circle;

/**
 * Entrance
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午5:54
 */
public class Entrance {
    public static void main(String[] args) {
        Circle circle = new Circle(new Red());
        circle.draw();
        Circle circle1 = new Circle(new Blue());
        circle1.draw();
    }
}
