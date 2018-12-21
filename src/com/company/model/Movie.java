package com.company.model;

public class Movie extends MediaItem implements Playable {

	public Movie(int id, String title, String author, String releaseDate, String source, int length){
		super(id, title, author, releaseDate, source, length);
	}

	@Override
	public String toString() {
		return "Movie title: "+ title+", Studio: "+author+", Release Date: "+releaseDate+", Length(in min): "+length;
	}

	@Override
	public void play() {
		System.out.println(this.toString());
		System.out.println("Running Media Player");
	}

	@Override
	public void preview() {
		System.out.println(this.toString());
		System.out.println("Running Media Player preview");
	}
}
