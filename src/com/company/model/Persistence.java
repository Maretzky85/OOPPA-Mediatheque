package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Persistence {

	public List<MediaItem> getData() {
		return data;
	}

	List<MediaItem> data = new ArrayList<MediaItem>();

	public void importData(){
		//TODO import data from database to list
	}

	public void addNewRecord(MediaItem item){
		data.add(item);
	}

	public void removeRecord(int id){
		data.stream().filter(item -> item.getId() == id).forEach(this::removeObjectFromData);
	}

	private void removeObjectFromData(MediaItem item){
		data.remove(item);
	}

	public void saveData(){
		//TODO export data to database
	}

	public void editData(int id){
		//TODO replace data by ID and save
	}
}
