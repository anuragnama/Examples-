package com.github.design.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTestCases {

	
	private Singleton target1;
	private Singleton target2;
    private Runnable getLetterss;
    private Runnable getLettersAgain;
    
    
	@Before
	public void setUp(){
		target1= Singleton.getInstance();
		target2= Singleton.getInstance();
		getLetterss= new LettersRunnable();
		getLettersAgain= new LettersRunnable();
	}
	
	@Test
	public void run_test(){
		        
	         Singleton s = Singleton.getInstance();
	        
	        Singleton singleton = null;
			synchronized(Singleton.class) {
		
	            if(singleton == null) 
	               singleton = s;     
	         }
	        
			/**
			 * Local reference must be equal to the one and
	         only instance of Singleton; otherwise, we have two
	            Singleton instances.
			 */
	         Assert.assertEquals(true, s == singleton);
	      }
	
	
	@Test
	public void test_singletonrunning_success(){
		
		
		System.out.println(" checking singleton object equality");
		Assert.assertEquals(true, target1==target2);
	}
	
	
	/*
	@Test
	public void letters_Thread_success() throws InterruptedException{
		
				
		new Thread(getLetterss).start();
		new Thread(getLettersAgain).start();
	}
	*/
	
}
