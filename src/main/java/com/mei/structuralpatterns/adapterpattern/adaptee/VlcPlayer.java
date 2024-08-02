package com.mei.structuralpatterns.adapterpattern.adaptee;

/**
 * VlcPlayer
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午4:06
 */
public class VlcPlayer implements OnlyPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 无法处理 不做任何事情
    }
}
