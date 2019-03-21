package com.lister.pattern.structural.adaptor;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlv play " +fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("do nothing");
    }
}
