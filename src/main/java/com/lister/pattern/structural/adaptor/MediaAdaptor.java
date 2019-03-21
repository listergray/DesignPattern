package com.lister.pattern.structural.adaptor;

public class MediaAdaptor implements MediaPlayer {

    AdvancedMediaPlayer player;

    public MediaAdaptor(String audioType){
        if(audioType.equals("mp4")){
            player = new Mp4Player();
        }else if (audioType.equals("vlc")){
            player = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4")){
            player.playMp4(fileName);
        }else if (audioType.equals("vlc")){
            player.playVlc(fileName);
        }
    }
}
