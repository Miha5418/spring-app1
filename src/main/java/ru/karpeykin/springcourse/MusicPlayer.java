package ru.karpeykin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mihail
 */
@Component("musicPlayer")
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    String name;

    @Value("${musicPlayer.volume}")
    int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    @Autowired
    private MusicPlayer(@Qualifier("classicalMusicBean") Music music1,
                        @Qualifier("rockMusicBean") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + music2.getSong();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("I'm init!");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("I'm destroy!");
    }
}