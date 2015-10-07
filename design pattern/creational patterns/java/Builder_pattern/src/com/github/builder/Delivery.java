package com.github.builder;

public class Delivery {

	
	 private FruitCakeBuilder fruitCakeBuilder;

	  public void setFruitcakeBuilder(FruitCakeBuilder cake) {
		  
		  fruitCakeBuilder = cake ;
		  
	  }
	  public FruitCake getFruitCake() {
		  
		  return fruitCakeBuilder.getFruitCake(); 
		  
	  }

	  public void constructFruitCake() {
		  
		  fruitCakeBuilder.createNewFruitCakeProduct();
		  
		  fruitCakeBuilder.buildCream();
		  
		  fruitCakeBuilder.buildBread();
		  
		  fruitCakeBuilder.buildFruitPaste();
		  
		  
	  }
	
	
}
