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

public class RoboTest {

	 
	private Robot target;
	private RobotBuilder target3;
	private  RobotEngineer robotEngineer;
	
	
	@Before
	public void setUp(){
		
		
		RobotBuilder robotBuilder = null ;
	
		 target3 = new OldRobotBuilder();
		
		robotEngineer = new RobotEngineer(target3);
		
	    robotEngineer.makeRobot();
		
	    target = robotEngineer.getRobot();
		 
	    
	}
	
	
	@Test
	public void test_getRobotHead(){
		
		String name= "robo head";
	     
		assertEquals(name, target.getRobotHead());
		
	}
	
	
	@Test
	public void test_getRobotArms(){
		
		String name= "robo arms";
		
	     
		assertEquals(name, target.getRobotArms());
		
	}
	
	
	@Test
	public void test_getRobotLegs(){
		
		String name= "robo legs";
	     
		assertEquals(name, target.getRobotLegs());
		
	}
	
	@Test
	public void test_getRobotTorso(){
		
		String name= "robo torso";
		
	     
		assertEquals(name, target.getRobotTorso());
		
	}
	
	@Test
	public void notNullRobotBuilder(){
		
		
		Assert.assertNotNull(target3);
		
	}
	
}
