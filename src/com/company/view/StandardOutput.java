package com.company.view;

import com.company.model.MediaItem;

import java.io.IOException;
import java.util.Scanner;

public class StandardOutput {
	private static Scanner scanner = new Scanner(System.in);

	private static void clearScreen() {
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException ignored) {
			//TODO add logging module
		}
		System.out.print("\033[H\033[2J");
	}

	private static int inputValidator(){
		System.out.println("\n\nSelect number and press Enter");
		while(!scanner.hasNextInt()){
			System.out.println("Please enter a number");
			scanner.nextLine();
		}
		return scanner.nextInt();
	}

	public void showMenu() {
		int choice = 9;
		clearScreen();
		while (choice > 0) {
			System.out.println("Mediateque menu\n\n" +
					"1 - Search engine\n"+
					"2 - Manager menu\n"+
					"0: Return");
			switch (inputValidator()) {
				case 1:
					break;
				case 2:
					break;
				case 0:
					choice = 0;
					break;
			}
		}
	}


	public void showMenu(String[] menu){
		for (int i = 0; i<menu.length; i++){
			System.out.println(i+1 + " - " + menu[i]);
		}
		//TODO print menu taken from method argument
	}

	public void showResoults(MediaItem[] mediaItems){
		for (int i = 0; i<mediaItems.length; i++){
			System.out.println(mediaItems[i].getId() + " - " + mediaItems[i].getMetadata());
		}
		//TODO print resoults taken in argument
	}
}
