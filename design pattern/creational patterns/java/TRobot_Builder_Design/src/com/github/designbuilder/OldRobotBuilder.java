package com.github.designbuilder;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;

	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	
	
	public void buildRobotHead() {
		
		robot.setRobotHead("robo head");
		
	}


	public void buildRobotTorso() {
		
		robot.setRobotTorso("robo torso");
		
	}

	
	public void buildRobotArms() {
		
		robot.setRobotArms("robo arms");
		
	}

	
	public void buildRobotLegs() {
		robot.setRobotLegs("robo legs");
		
	}
	
	public Robot getRobot(){
		return this.robot ;
		
		
		
	}
}
