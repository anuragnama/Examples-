package com.github.design.singleton;

public class LettersThread{
	
	public static void main(String[] args){
		
		
		Runnable getLetterss = new LettersRunnable();
				
		Runnable getLetterAgain = new LettersRunnable();
				
		
				
		new Thread(getLetterss).start();
		new Thread(getLetterAgain).start();
		
		
	}
	
}