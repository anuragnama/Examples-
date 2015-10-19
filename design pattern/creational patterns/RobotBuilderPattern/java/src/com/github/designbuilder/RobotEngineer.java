package com.github.designbuilder;

public class RobotEngineer {
	
	private RobotBuilder robotBuilder;
	
	
	
	
	public RobotEngineer(RobotBuilder robotBuilder){
		
		this.robotBuilder = robotBuilder;
		
	}
	

	public Robot getRobot(){
		
		return this.robotBuilder.getRobot();
		
	}
	
	
	
	
	/**
	 * Execute the methods specific to the RobotBuilder that implements RobotBuilder (OldRobotBuilder)
	 */
	
	public void makeRobot() {
		
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		
	}
	
}