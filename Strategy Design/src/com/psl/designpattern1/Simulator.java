package com.psl.designpattern1;

public class Simulator {

	public static void main(String[] args) {
		
		Duck americanduck= new AmericanDuck();
		
		americanduck.performFly();
		americanduck.performQuack();
		
		Duck modal= new ModalDuck();
		modal.performFly();
		modal.performQuack();
		
		modal.setFlyAbility(new Rocket());
		
	}
	
	
}
