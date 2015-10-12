package com.github.builder;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class TestBuilder {

	private Delivery target1;
	private FruitCakeBuilder target2;
	private FruitCakeBuilder target3;
	
	
	
	 @Before
		public void setUp() {
		  target1 = new Delivery();
		  target2 = new IndianFruitCake();
		  target3 = new ChineseFruitCake();
		}

	 
	 
	     @Test
	     public void not_null_FruitCake() {
	     
	         target1.setFruitcakeBuilder( target2 );
	         target1.constructFruitCake();

	        FruitCake fruitCake = target1.getFruitCake();
	        Assert.assertNotNull(target2);
	        Assert.assertNotNull(target3);
	        Assert.assertNotNull(fruitCake);
	    }
	     
	     
	     
	      @Test
	     public void testFruitcakeBuilders() {
	    	  
		         target1.setFruitcakeBuilder( target2 );
		         target1.constructFruitCake();


			        FruitCake fruitCake = target1.getFruitCake();
			        
			        assertEquals( fruitCake, target2.getFruitCake());
	        
	    }

	  
	
}
