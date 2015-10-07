package com.github.design.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTestCases {

	
	private Singleton target1;
	private Singleton target2;
    private Singleton target3;
    private Runnable getletterss;
    private Runnable getlettersAgain;
    
    
	@Before
	public void setUp(){
		target1= Singleton.getInstance();
		target2= Singleton.getInstance();
		getletterss= new GetLetters();
		getlettersAgain= new GetLetters();
	}
	
	@Test
	public void run_test(){
		        
	         Singleton s = Singleton.getInstance();
	        
	        Singleton singleton = null;
			synchronized(Singleton.class) {
				/**
				 * If local reference is null
				 */
	            if(singleton == null) 
	               singleton = s;     
	            /**
	             * set it to the singleton
	             */
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
	
	
	
	@Test
	public void letters_Thread_success() throws InterruptedException{
		
				
		new Thread(getletterss).start();
		new Thread(getlettersAgain).start();
	}
}
