package com.psl.designpattern1;

public abstract  class Duck {

	FlyAbility flyability;
	QuackAbility quackability;
	
	public abstract void display();
	public void swim() {
		System.out.println(" Every duck can swim");
		
	}
	
	public void performFly() {
		flyability.fly();
	}
	
	public void performQuack() {
		quackability.quack();
		
	}
	
	public void setFlyAbility(FlyAbility fb)
	{
		flyability=fb;
	}
	public void setQuackAbility(QuackAbility qa) {
		quackability= qa;
	}
}
