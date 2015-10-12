package com.github.design.singleton;

	 
import java.util.LinkedList;

public class LettersTest {
	
	public static void main(String[] args){
		
		
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
		
		
		
		System.out.println(newInstance.getLetterList());
		
		/**
		 *  let  Player1 draws 7 letters
		 */
		
		LinkedList<String> playerOneLetters = newInstance.getLetters(7);
		
		System.out.println("Player 1: " + playerOneLetters);
		
		System.out.println(newInstance.getLetterList());
		
		
		
		Singleton instanceTwo = Singleton.getInstance();
		
		
		
		System.out.println(" 2nd Instance ID: " + System.identityHashCode(instanceTwo));
		
		System.out.println(instanceTwo.getLetterList());
		
		
		LinkedList<String> playerTwoLetters = newInstance.getLetters(7);
		
		System.out.println("Player 2: " + playerTwoLetters);
		
	}
	
}