package ru.voronov.learnGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer{
    private Music music1;
    private Music music2;

    private List<Music> listMusic;

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //Inversion of control
//    public MusicPlayer(@Qualifier("rockMusic") Music music,
//                       @Qualifier("popMusic") Music music2) {
//        this.music1 = music;
//        this.music2 = music2;
//    }
//
    public String playMusic(){
        return ("Playing: "+ listMusic.get(new Random().nextInt(listMusic.size())).getSong());
    }

}
