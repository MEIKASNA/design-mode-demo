package com.mei.structuralpatterns.bridgepattern.color;

/**
 * Red
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午5:50
 */
public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
