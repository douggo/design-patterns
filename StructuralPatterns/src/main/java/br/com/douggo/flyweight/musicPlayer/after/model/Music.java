package br.com.douggo.flyweight.musicPlayer.after.model;

import br.com.douggo.flyweight.musicPlayer.after.flyweight.MusicFlyweight;

public class Music {
	private MusicFlyweight music;
	private Integer playerQty;
	
	public Music(MusicFlyweight music) {
		this.music = music;
		this.playerQty = 0;
	}

	public MusicFlyweight getMusic() {
		return music;
	}

	public void setMusic(MusicFlyweight music) {
		this.music = music;
	}

	public Integer getPlayerQty() {
		return playerQty;
	}

	public void setPlayerQty(Integer playerQty) {
		this.playerQty = playerQty;
	}

	public void listening() {
		playerQty++;
	}

	@Override
	public String toString() {
		return "Music{" +
				"music=" + music +
				", playerQty=" + playerQty +
				'}';
	}
}
