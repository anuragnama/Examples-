package com.github.design.singleton;

import java.util.LinkedList;


import java.util.LinkedList;

public class GetLetters implements Runnable {
	
	public void run(){

			
			/**
			 * creating  new instance of Singleton
			 */
			Singleton newInstance = Singleton.getInstance();
			
			
			/** 
			 * Get unique id for instance object
			 */
			System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
			
			
			
			/**
			 * Get all of the letters stored in the List
			 */
			
			System.out.println(newInstance.getLetterList());
			
			LinkedList<String> playerOne = newInstance.getletters(7);
			
			System.out.println("Player 1: " + playerOne);
		
		System.out.println("Got Tiles");
	}
	
}