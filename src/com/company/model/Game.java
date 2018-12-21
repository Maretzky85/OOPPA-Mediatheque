package com.company.model;

public class Game extends MediaItem implements Playable{

	public Game(int id, String title, String author, String releaseDate, String source, int length){
		super(id, title, author, releaseDate, source, length);
	}

	@Override
	public String toString() {
		return "Title: "+ title+", Studio: "+author+", Release Date: "+releaseDate+", Playable Hours: "+length;
	}

	@Override
	public void play() {
		System.out.println(this.toString());
		System.out.println("Downloading game...");

	}

	@Override
	public void preview() {
		System.out.println(this.toString());
		System.out.println("Downloading demo...");
	}
}
