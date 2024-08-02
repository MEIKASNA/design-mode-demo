package com.mei.structuralpatterns.adapterpattern.target;

/**
 * MediaPlayer
 * 目标接口 这是客户需要的目标接口 他能够播放所有类型的音频文件
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午3:53
 */
public interface MediaPlayer {

    void play(String audioType, String fileName);
}
