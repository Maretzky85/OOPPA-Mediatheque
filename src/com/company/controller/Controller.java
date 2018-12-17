package com.company.controller;

import com.company.model.Persistence;
import com.company.view.StandardOutput;

public class Controller {

	Persistence persistence = new Persistence();
	StandardOutput userOutput = new StandardOutput();

	public Controller(){
		persistence.importData();
		userOutput.showMenu();
	}

}
