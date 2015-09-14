package com.psl.designpattern1;

public class AmericanDuck extends Duck{

	public AmericanDuck() {
		
		flyability = new FlyWithWings();
		quackability = new Quack();	
	}

	@Override
	public void display() {
		
		System.out.println(" I am AmericanDuck");
		
	}

	

	
	
}
