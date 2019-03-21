package com.lister.pattern.structural.adaptor;

public class Adaptor {
    public static void main(String[] args) {
        AudioAdaptor audioAdaptor = new AudioAdaptor();
        audioAdaptor.play("mp3","mp3.mp3");
        audioAdaptor.play("mp4","mp4.mp4");
        audioAdaptor.play("vlc","vlc.vlc");
        audioAdaptor.play("game","game");
    }
}
