package ru.voronov.learnGradle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music {

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }
//    @PostConstruct
//    public void doInit(){
//        System.out.println("Doing my initialization");
//    }
//    @PreDestroy
//    public void doDestroy(){
//        System.out.println("Doing my destruction");
//    }
    @Override
    public String getSong() {
        return "RockMusic";
    }
}
