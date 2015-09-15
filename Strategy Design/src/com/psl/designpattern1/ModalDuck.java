package com.psl.designpattern1;

public class ModalDuck extends Duck{

	public ModalDuck() {
		flyability = new FlyWithNoWings();
		quackability=  new Quack();
	}

	@Override
	public void display() {
		System.out.println(" ModalDuck");
		
	}
}
