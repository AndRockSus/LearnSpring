package ru.voronov.learnGradle;

import org.springframework.stereotype.Component;


public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "PopMusic";
    }
}
