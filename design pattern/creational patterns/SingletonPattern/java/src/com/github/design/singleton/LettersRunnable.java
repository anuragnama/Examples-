package com.github.design.singleton;

 import java.util.LinkedList;




public class LettersRunnable implements Runnable {
	
	
	
		public void run() {
			
			
			Singleton newInstance = Singleton.getInstance();
			
		
			System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
			
			
			System.out.println(newInstance.getLetterList());
			
			LinkedList<String> playerOne = newInstance.getLetters(7);
			
			System.out.println("Player 1: " + playerOne);
		
		System.out.println("Got Tiles");
	}
	}	
	
