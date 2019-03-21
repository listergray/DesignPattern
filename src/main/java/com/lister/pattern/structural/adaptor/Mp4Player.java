package com.lister.pattern.structural.adaptor;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("do nothing");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 play" + fileName);
    }
}
