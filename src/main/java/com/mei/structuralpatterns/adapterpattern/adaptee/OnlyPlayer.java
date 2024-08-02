package com.mei.structuralpatterns.adapterpattern.adaptee;

/**
 * OnlyPlayer
 * 被适配接口  这个接口只可以播放单一类型的音频文件
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午4:03
 */
public interface OnlyPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}
