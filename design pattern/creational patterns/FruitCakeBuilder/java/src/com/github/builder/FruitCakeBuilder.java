package com.github.builder;

public abstract class FruitCakeBuilder {
	
	
	
		  protected FruitCake fruitCake;

		  public FruitCake getFruitCake() {
			  
			  return fruitCake;
			  
		  }
		  
		  public void createNewFruitCakeProduct() {
			  
			  fruitCake = new FruitCake();
			  
		  }

		  public abstract  void buildCream();
		  public abstract  void buildBread();
		  public abstract  void buildFruitPaste();
		
	

}
