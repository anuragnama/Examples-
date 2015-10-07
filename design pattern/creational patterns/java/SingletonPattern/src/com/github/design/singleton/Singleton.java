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
   
              /**
               * initilization of thread 
               */
	static boolean firstThread = true;
	

   
	/**
	 * private singleton constructor
	 * Only Singleton will be able to instantiate this class
	 */
	private Singleton() {
		
	}
	
	
	/**
	 * @return firstinstance
	 */
	public static Singleton getInstance() {
		if(firstInstance == null) {
			
			
			/**
			 * threads is trying to create instances of this class
			 */
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
			 * use to synchronized when the first object is created
			 */
			synchronized(Singleton.class){ 
			
				if(firstInstance == null) {
					
			       /**
			        * instance is created when  it is needed
			        */
					firstInstance = new Singleton();
			
					/**
					 * shuffle the letters
					 */
					Collections.shuffle(firstInstance.letterList);
					
				}
			
			}
			
		}
		
		
		/**
		 * return firstinstance
		 */
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		
		return firstInstance.letterList;
		
	}
	
	public LinkedList<String> getletters(int lettersNum){
		
		/**
		 * return the letters
		 */
		
		LinkedList<String> sendLetters = new LinkedList<String>();
		
		
		/**
		 * loop through linked list while adding the starting Strings to the to be returned LinkedList while deleting them from letterList
		 */
		
		for(int i = 0; i <= lettersNum; i++){
		
			sendLetters.add(firstInstance.letterList.remove(0));
		
		}
		
		/**
		 *  Return the letters
		 */
		
		return sendLetters;
		
	}
	
}