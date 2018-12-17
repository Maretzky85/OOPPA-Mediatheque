package com.company.model;

public class MediaItem implements Rentable, Playable{

	MediaType type;

	int id;

	String title;

	String author;
	String releaseDate;
	String source;

	public MediaItem(MediaType type, int id, String title, String author, String releaseDate, String source, int length) {
		this.type = type;
		this.id = id;
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
		this.source = source;
		this.length = length;
	}

	int length;

	public String getMetadata(){
		return "Title: "+title+
				"Author: "+author+
				"Release Date: "+releaseDate+
				"Length: "+length;
	}

	public int getId() {
		return id;
	}

	@Override
	public void play() {
		//TODO
	}

	@Override
	public void rent() {
		//TODO
	}

	@Override
	public void returnItem() {
		//TODO
	}

	@Override
	public void reserve() {
		//TODO
	}
}
