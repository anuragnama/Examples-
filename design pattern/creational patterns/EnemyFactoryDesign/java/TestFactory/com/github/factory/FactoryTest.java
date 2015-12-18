package com.github.factory;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FactoryTest {


	    
	    private EnemyShip target1,target2,target3;
	    private EnemyShipFactory target4;
	    private  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    
	    @Before
	    public void setUp() {
	          
	    	System.setOut(new PrintStream(outContent));
	            target1 = new UfoEnemyShip();
	            target2 = new RocketEnemyShip();
	            target3 = new BigUfoEnemyShip();
	            target4 = new EnemyShipFactory();
	             
	    }

	   @After
	    public void cleanUp() {
	        System.setOut(null);
	    }

	    @Test
	    public void TestUFOEnemyShip() {
	      
	        String shipName = "UFO Enemy Ship";
	        double damage = 20.0;

	        Assert.assertEquals(shipName, target1.getName());
	        Assert.assertEquals(damage, target1.getAmtDamage());

	       outContent.reset();
	       target1.displayEnemyShip();
	        Assert.assertEquals(shipName + " is on the screen", outContent.toString().trim());
	        
	        outContent.reset();
	        target1.followHeroShip();
	        Assert.assertEquals(shipName + " is following the hero", outContent.toString().trim());

	        outContent.reset();
	        target1.enemyShipShoots();
	        Assert.assertEquals(shipName + " attacks and does " + String.valueOf(damage) + " damage to hero", outContent.toString().trim());
	    }

	    @Test
	    public void TestRoketEnemyShip() {
	    	
	        
	        String shipName = "Rocket Enemy Ship";
	        double damage = 10.0;

	        Assert.assertEquals(shipName, target2.getName());
	        Assert.assertEquals(damage, target2.getAmtDamage());

	        outContent.reset();
	        target2.displayEnemyShip();
	        Assert.assertEquals(shipName + " is on the screen", outContent.toString().trim());
	        
	        outContent.reset();
	        target2.followHeroShip();
	        Assert.assertEquals(shipName + " is following the hero", outContent.toString().trim());

	        outContent.reset();
	        target2.enemyShipShoots();
	        Assert.assertEquals(shipName + " attacks and does " + String.valueOf(damage) + " damage to hero", outContent.toString().trim());
	    }

	    @Test
	    public void TestBigUFOEnemyShip() {


	        String shipName = "Big UFO Enemy Ship";
	        double damage = 40.0;

	        Assert.assertEquals(shipName, target3.getName());
	        Assert.assertEquals(damage, target3.getAmtDamage());

	        outContent.reset();
	        target3.displayEnemyShip();
	        Assert.assertEquals(shipName + " is on the screen", outContent.toString().trim());
	        outContent.reset();
	        target3.followHeroShip();
	        Assert.assertEquals(shipName + " is following the hero", outContent.toString().trim());

	   
	        outContent.reset();
	        target3.enemyShipShoots();
	        Assert.assertEquals(shipName + " attacks and does " + String.valueOf(damage) + " damage to hero", outContent.toString().trim());
	    }

	    @Test
	    public  void TestEnemyShipFactory() {
	      

	        EnemyShip newShip = target4.makeEnemyShip("U");
	        Assert.assertEquals("UFO Enemy Ship", newShip.getName());
	        Assert.assertEquals(20.0, newShip.getAmtDamage());

	        newShip = target4.makeEnemyShip("R");
	        Assert.assertEquals("Rocket Enemy Ship", newShip.getName());
	        Assert.assertEquals(10.0, newShip.getAmtDamage());

	        newShip = target4.makeEnemyShip("B");
	        Assert.assertEquals("Big UFO Enemy Ship", newShip.getName());
	        Assert.assertEquals(40.0, newShip.getAmtDamage());

	        newShip = target4.makeEnemyShip("Z");
	        assertNull(newShip);
	    }
	}

	
	

