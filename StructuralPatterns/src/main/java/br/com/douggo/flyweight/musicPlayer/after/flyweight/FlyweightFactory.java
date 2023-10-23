package br.com.douggo.flyweight.musicPlayer.after.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlyweightFactory {

    private final static FlyweightFactory INSTANCE = new FlyweightFactory();

    private static Map<String, MusicFlyweight> REPOSITORY;

    public FlyweightFactory() {
        REPOSITORY = new HashMap<>();
    }

    public static FlyweightFactory getInstance() {
        return INSTANCE;
    }

    public MusicFlyweight getMusic(String musicDetails) {
        MusicFlyweight music = REPOSITORY.get(musicDetails);
        if (Objects.isNull(music)) {
            System.out.println("Creating a flyweight for music: " + musicDetails);
            music = this.getMusicByString(musicDetails);
            REPOSITORY.put(musicDetails, music);
        }
        return music;
    }

    private MusicFlyweight getMusicByString(String musicDetails) {
        String[] musicData = musicDetails.split(";");
        return new MusicFlyweight(musicData[0], musicData[1], Integer.parseInt(musicData[2]));
    }

    public Integer getSize() {
        return REPOSITORY.size();
    }


}
