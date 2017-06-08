package com.designPatterns.Adapter;

public class client {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "My heart will go on.mp3");
		audioPlayer.play("mp4", "Transformers.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "Batman.avi");
	}
}
