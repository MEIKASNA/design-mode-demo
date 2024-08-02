package com.mei.structuralpatterns.adapterpattern.adapter;

import com.mei.structuralpatterns.adapterpattern.target.MediaPlayer;

/**
 * AudioPlayer
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午4:12
 */
public class AudioPlayer implements MediaPlayer {

    PlayerAdapter playerAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            // 本身内置支持 mp3 格式
            System.out.println("Playing mp3 file. " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            playerAdapter = new PlayerAdapter(audioType);
            playerAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("无法处理该格式");
        }
    }
}
