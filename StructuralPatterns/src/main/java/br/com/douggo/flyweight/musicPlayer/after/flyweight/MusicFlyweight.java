package br.com.douggo.flyweight.musicPlayer.after.flyweight;

public class MusicFlyweight {

    private final String name;
    private final String artist;
    private final int duration;

    public MusicFlyweight(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "MusicFlyweight{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
