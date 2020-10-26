package ru.voronov.learnGradle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class TestSpring {
    public static void main(String[] args) {
        // конфиг через xml
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
        // конфиг через аннотации и java класс
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer mp = new MusicPlayer(music);
//
//        mp.playMusic();

//        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);

//        Computer comp = context.getBean("computer", Computer.class);
//        System.out.println(comp);

//        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(mp.getName() + " " + mp.getVolume());
//
//        ClassicalMusic cm1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic cm2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        System.out.println(cm1 == cm2);

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println( mp.playMusic());
        context.close();
    }
}
