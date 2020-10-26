package ru.voronov.learnGradle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean MusicPlayer musicPlayer(){
        return  new MusicPlayer(listMusic());
    }
    @Bean Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean
    List<Music> listMusic(){
        return Arrays.asList(popMusic(),rockMusic(),classicalMusic());
    }

}
