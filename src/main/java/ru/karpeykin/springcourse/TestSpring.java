package ru.karpeykin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mihail
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        Music music2 = context.getBean("classicalMusicBean", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music2);

        musicPlayer.playMusic();
        musicPlayer1.playMusic();

        context.close();
    }
}
