package com.company.model;

public class Music extends MediaItem implements Playable {

	public Music(int id, String title, String author, String releaseDate, String source, int length){
		super(id, title, author, releaseDate, source, length);
	}

	@Override
	public String toString() {
		return "Song title: "+ title+", Author: "+author+", Release Date: "+releaseDate+", Length(in sec): "+length;
	}

	@Override
	public void play() {
		System.out.println(this.toString());
		System.out.println("Playing "+this.getTitle());
	}

	@Override
	public void preview() {
		System.out.println(this.toString());
		System.out.println("Previewing "+this.getTitle());
	}
}
