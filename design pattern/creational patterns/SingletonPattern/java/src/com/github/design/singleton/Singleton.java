package com.github.design.singleton;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	
	private static Singleton firstInstance = null;
	

	String[] letters = {"a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e",};  
	
	private LinkedList<String> letterList = new LinkedList<String> (Arrays.asList(letters));
   
	
	static boolean firstThread = true;
	

	private Singleton() {
		
	}
	
	
	public static Singleton getInstance() {
		if(firstInstance == null) {
			
			
			if(firstThread){
			
				firstThread = false;
				
				try {
					Thread.currentThread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
			
			
			/**
			 *  synchronized when the first object is created
			 */
			synchronized(Singleton.class){ 
			
				if(firstInstance == null) {
					
			       
					firstInstance = new Singleton();
			
					
					Collections.shuffle(firstInstance.letterList);
					
				}
			
			}
			
		}
		
	
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		
		return firstInstance.letterList;
		
	}
	
	public LinkedList<String> getLetters(int lettersNum){
		
		
		
		LinkedList<String> sendLetters = new LinkedList<String>();
		
		
		
		for(int i = 0; i <= lettersNum; i++){
		
			sendLetters.add(firstInstance.letterList.remove(0));
		
		}
		
		
		return sendLetters;
		
	}
	
}