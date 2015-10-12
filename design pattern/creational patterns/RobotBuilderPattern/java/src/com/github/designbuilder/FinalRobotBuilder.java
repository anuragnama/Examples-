package com.github.designbuilder;

public class FinalRobotBuilder {
	


public static void main(String[] args){
		
	
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
	
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		
		robotEngineer.makeRobot();
		
		
		/**
		 * engineer returns the robot information
		 */
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
		
	}

}