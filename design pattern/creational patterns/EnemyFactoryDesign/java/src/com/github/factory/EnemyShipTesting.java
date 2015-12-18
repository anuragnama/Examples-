package com.github.factory;


import java.util.Scanner;

public class EnemyShipTesting {

	

	    public static void main(String[] args){

	      
	        EnemyShipFactory shipFactory = new EnemyShipFactory();

	        EnemyShip enemy = null;
	        Scanner userInput = new Scanner(System.in);
	 
	        System.out.print("What type of ship? (U / R / B)");

	        if (userInput.hasNextLine()){
	            String typeOfShip = userInput.nextLine();
	            enemy = shipFactory.makeEnemyShip(typeOfShip);
	          
	            if(enemy != null){
	                doStuffEnemy(enemy);
	            }
	            
	           
	        }
	        
	        else System.out.println("REWRITE AGAIN");
	        }

	        
	    public static void doStuffEnemy(EnemyShip enemyShip){
	    	
	        enemyShip.displayEnemyShip();
	        enemyShip.followHeroShip();
	        enemyShip.enemyShipShoots();
	    }

	

	
}
