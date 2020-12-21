package ru.karpeykin.springcourse;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
