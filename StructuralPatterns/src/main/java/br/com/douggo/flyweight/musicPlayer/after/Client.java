package br.com.douggo.flyweight.musicPlayer.after;

import br.com.douggo.flyweight.musicPlayer.after.service.MusicService;

public class Client {

	public static void main(String[] args) {
		MusicService player = new MusicService();

		player.listenMusic("User A", "The Unforgiven;Metallica;300");
		player.listenMusic("User A", "The Unforgiven;Metallica;300");
		player.listenMusic("User A", "The Unforgiven;Metallica;300");
		player.listenMusic("User A", "Be Yourself;Audioslave;200");
		player.listenMusic("User B", "The Unforgiven;Metallica;300");
		player.listenMusic("User B", "Be Yourself;Audioslave;200");
		
		player.report();
	}
}
