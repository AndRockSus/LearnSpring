package ru.voronov.learnGradle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Requiem";
    }
}
