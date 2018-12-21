package com.company.model;

public abstract class MediaItem implements Rentable{

	int id;
	int length;

	String title;
	String author;
	String releaseDate;
	String source;

	public MediaItem(int id, String title, String author, String releaseDate, String source, int length) {
		this.id = id;
		this.length = length;
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
		this.source = source;
	}

	@Override
	public abstract String toString();

	public int getId() {
		return id;
	}

	public int getLength(){
		return length;
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public String getSource(){
		return source;
	}

	public void setLength(int length) {
		if (length >= 0) {
			this.length = length;
		}
	}

	public void setTitle(String title) {
		if (title.length() > 0){
			this.title = title;
		}

	}

	public void setAuthor(String author) {
		if (author.length() > 0){
			this.author = author;
		}

	}

	public void setReleaseDate(String releaseDate) {
		if (releaseDate.length() > 0){
			this.releaseDate = releaseDate;
		}

	}

	public void setSource(String source) {
		//TODO adres checker
		this.source = source;
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
