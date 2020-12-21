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

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayerFirst = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayerSecond = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayerFirst == musicPlayerSecond;

        System.out.println(comparison);

        System.out.println(musicPlayerFirst);
        System.out.println(musicPlayerSecond);

        musicPlayerFirst.setVolume(10);

        System.out.println(musicPlayerFirst.getVolume());
        System.out.println(musicPlayerSecond.getVolume());
        /*
        musicPlayerFirst.playMusic();
        System.out.println("1 name: " + musicPlayerFirst.getName()+ " volume: " + musicPlayerFirst.getVolume());

        musicPlayerSecond.setVolume(90);
        musicPlayerFirst.playMusic();
        System.out.println("2 name: " + musicPlayerSecond.getName()+ " volume: " + musicPlayerSecond.getVolume());
*/
        context.close();
    }
}
