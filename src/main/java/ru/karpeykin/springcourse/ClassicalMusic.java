package ru.karpeykin.springcourse;

import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
