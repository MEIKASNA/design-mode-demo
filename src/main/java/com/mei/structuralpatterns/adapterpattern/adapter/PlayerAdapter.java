package com.mei.structuralpatterns.adapterpattern.adapter;

import com.mei.structuralpatterns.adapterpattern.adaptee.Mp4Player;
import com.mei.structuralpatterns.adapterpattern.adaptee.OnlyPlayer;
import com.mei.structuralpatterns.adapterpattern.adaptee.VlcPlayer;
import com.mei.structuralpatterns.adapterpattern.target.MediaPlayer;

/**
 * PlayerAdapter
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午4:09
 */
public class PlayerAdapter implements MediaPlayer {

    OnlyPlayer onlyPlayer;

    public PlayerAdapter(String fileType) {
        if(fileType.equalsIgnoreCase("mp4")) {
            onlyPlayer = new Mp4Player();
        } else if (fileType.equalsIgnoreCase("vlc")) {
            onlyPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")) {
            onlyPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            onlyPlayer.playVlc(fileName);
        }
    }
}
