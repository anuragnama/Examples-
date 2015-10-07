package com.github.design.singleton;

public class LettersThread{
	
	public static void main(String[] args){
		
		
				/**
				 * Create a new Thread  using the Runnable interface
				 */
		Runnable getletterss = new GetLetters();
				
		Runnable getletterAgain = new GetLetters();
				
		
				/**
				 * call to run the thread
				 */
		new Thread(getletterss).start();
		new Thread(getletterAgain).start();
		
		
	}
	
}