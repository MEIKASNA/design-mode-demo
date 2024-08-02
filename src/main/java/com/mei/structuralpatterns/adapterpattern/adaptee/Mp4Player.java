package com.mei.structuralpatterns.adapterpattern.adaptee;

/**
 * Mp4Player
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午4:05
 */
public class Mp4Player implements OnlyPlayer{
    @Override
    public void playVlc(String fileName) {
        // 无法处理 不做任何事情
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
