package com.company.model;

public class Book extends MediaItem implements Playable {

	public Book(int id, String title, String author, String releaseDate, String source, int length){
		super(id, title, author, releaseDate, source, length);
	}

	@Override
	public String toString() {
		return "Book title: "+ title+", Publisher: "+author+", Release Date: "+releaseDate+", Pages: "+length;
	}

	@Override
	public void play() {
		System.out.println(this.toString());
		System.out.println("Running Book Viewer");
	}

	@Override
	public void preview() {
		System.out.println(this.toString());
		System.out.println("Running Book Pre-Viewer");
	}
}
