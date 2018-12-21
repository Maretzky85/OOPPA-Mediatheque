package com.company.controller;

import com.company.model.Persistence;
import com.company.view.StandardOutput;

public class Controller {

	Persistence persistence = new Persistence();
	StandardOutput userOutput = new StandardOutput();
	AbstractUser user;

	public Controller(){
		persistence.importData();
		userOutput.showMenu();
	}

}
