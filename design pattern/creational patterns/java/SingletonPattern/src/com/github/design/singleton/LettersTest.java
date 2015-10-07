package com.github.design.singleton;

	 
import java.util.LinkedList;

public class LettersTest {
	
	public static void main(String[] args){
		
		
		/**
		 *  create a new instance of Singleton
		 */
		Singleton newInstance = Singleton.getInstance();
		
		
		/**
		 * Get unique id for instance object
		 */
		System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
		
		
		/**
		 *  Get all of the letters stored in the List
		 */
		System.out.println(newInstance.getLetterList());
		/**
		 *  if Player1 draws 7 letters
		 */
		LinkedList<String> playerOneletters = newInstance.getletters(7);
		
		System.out.println("Player 1: " + playerOneletters);
		
		System.out.println(newInstance.getLetterList());
		
		/**
		 * making new instancestwo
		 */
		
		Singleton instanceTwo = Singleton.getInstance();
		
		
		
		System.out.println(" 2nd Instance ID: " + System.identityHashCode(instanceTwo));
		
		System.out.println(instanceTwo.getLetterList());
		
		/**
		 * if Player2 draws 7 letters
		 */
		
		LinkedList<String> playerTwoletters = newInstance.getletters(7);
		
		System.out.println("Player 2: " + playerTwoletters);
		
	}
	
}