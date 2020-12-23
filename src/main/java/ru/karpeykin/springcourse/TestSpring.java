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

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume() + musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        RockMusic rockMusic1 = context.getBean("rockMusicBean", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusicBean", RockMusic.class);
        System.out.println( rockMusic1 == rockMusic2);

        context.close();
    }
}
