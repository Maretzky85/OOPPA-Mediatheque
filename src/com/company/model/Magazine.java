package com.company.model;

public class Magazine extends MediaItem implements Playable {

	public Magazine(int id, String title, String author, String releaseDate, String source, int length){
		super(id, title, author, releaseDate, source, length);
	}

	@Override
	public String toString() {
		return "Magazine title: "+ title+", Publisher: "+author+", Release Date: "+releaseDate+", Pages: "+length;
	}

	@Override
	public void play() {
		System.out.println(this.toString());
		System.out.println("Viewing media...");

	}

	@Override
	public void preview() {
		System.out.println(this.toString());
		System.out.println("Viewing preview part ...");
	}
}
