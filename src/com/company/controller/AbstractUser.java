package com.company.controller;

import com.company.model.MediaItem;

public abstract class AbstractUser {
	public String name;

	public AbstractUser(String name){
		this.name = name;
	}

	public void play(MediaItem item){
		//TODO play chosen media
	}

	public void preview(MediaItem item){
		//TODO preview chosen media
	}

	public void rent(MediaItem item){
		//TODO rent media
	}

	public void reserve(MediaItem item){
		//TODO reserve media
	}

	public void returnItem(MediaItem item){
		//TODO return media
	}

}
