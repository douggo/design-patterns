package br.com.douggo.flyweight.musicPlayer.after.service;

import br.com.douggo.flyweight.musicPlayer.after.flyweight.FlyweightFactory;
import br.com.douggo.flyweight.musicPlayer.after.model.Music;

import java.util.*;

public class MusicService {
	private Map<String, Map<String, Music>> memory;

	public MusicService() {
		memory = new HashMap<>();
	}

	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);

		if(Objects.isNull(userPlayList)) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}

		Music song = userPlayList.get(desc);

		if(Objects.isNull(song)) {
			song = new Music(FlyweightFactory.getInstance().getMusic(desc));
			userPlayList.put(desc, song);
		}
		System.out.printf("%s is listenning '%s'%n",
				user,
				song.getMusic().getName()
		);
		song.listening();
	}

	public void report() {
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			System.out.println("---------");
			System.out.println(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.printf("%s/%s %d times%n",
						music.getMusic().getArtist(),
						music.getMusic().getName(),
						music.getPlayerQty()
				);
				timeCounter += (music.getPlayerQty() * music.getMusic().getDuration());
			}
			System.out.printf("%s has listen music for %d seconds%n", user, timeCounter);
		}
		System.out.println("Total of musics in flyWeight's memory: " + FlyweightFactory.getInstance().getSize());
	}
}
