package com.github.designbuilder;

public class FinalRobotBuilder {
	
/**
 * RobotBuilder of type OldRobotBuilder
 * @param args RobotBuilder of type OldRobotBuilder
 */
/**
 * 
 * @param args robotEngineer
 */
public static void main(String[] args){
		
	
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		// Pass the OldRobotBuilder specification to the engineer
		
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		
		/**
		 * ensure the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		 */
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
