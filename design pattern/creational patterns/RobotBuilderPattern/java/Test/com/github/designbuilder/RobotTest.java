package com.github.designbuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.designbuilder.FinalRobotBuilder;
import com.github.designbuilder.OldRobotBuilder;
import com.github.designbuilder.Robot;
import com.github.designbuilder.RobotBuilder;
import com.github.designbuilder.RobotEngineer;

public class RobotTest {

	private RobotEngineer target1;
	private Robot target;
	private RobotBuilder target3;
	private  RobotEngineer robotEngineer;
	
	
	@Before
	public void setUp(){
		
		
		RobotBuilder robotBuilder = null ;
	
		 target3 = new OldRobotBuilder();
		
		robotEngineer = new RobotEngineer(target3);
		 
	    
	}
	
	
	
	@Test
	public void notNullRobotBuilder(){
		
		//RobotBuilder old_robot_builder= new OldRobotBuilder();
		
		Assert.assertNotNull(target3);
		
	}
	
	
	@Test
	public void sucess_robotEngineer(){
		
		
     robotEngineer.makeRobot();
     Robot target = robotEngineer.getRobot();
		
		
	 Assert.assertEquals("robo head", target.getRobotHead());
	
	 Assert.assertEquals("robo arms", target.getRobotArms());
	 
	 Assert.assertEquals("robo legs", target.getRobotLegs());
	 
	 Assert.assertEquals("robo torso", target.getRobotTorso());
	
		
	}
	
	
}
