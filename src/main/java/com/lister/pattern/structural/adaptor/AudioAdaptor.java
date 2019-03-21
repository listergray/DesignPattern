package com.lister.pattern.structural.adaptor;

public class AudioAdaptor implements MediaPlayer {

    MediaAdaptor mediaAdaptor ;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("mp3 play" + fileName);
        }else if(audioType.equals("mp4") || audioType.equals("vlc")){
            mediaAdaptor = new MediaAdaptor(audioType);
            mediaAdaptor.play(audioType,fileName);
        }else{
            System.out.println("not support");
        }
    }
}
