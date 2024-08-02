package com.mei.structuralpatterns.adapterpattern;

import com.mei.structuralpatterns.adapterpattern.adapter.AudioPlayer;

/**
 * Entrance
 *
 * @author MEI
 * @version v0.1
 * 2024年08月02日 下午4:16
 */
public class Entrance {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "audio/mp3");
        audioPlayer.play("mp4", "audio/mp4");
        audioPlayer.play("vlc", "audio/vlc");
    }
}
