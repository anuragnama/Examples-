package com.github.factory;

public class EnemyShipFactory {

	
	

	public EnemyShip makeEnemyShip(String newShipType) {
		
		 EnemyShip newShip = null;

	        if (newShipType.equals("U")){
	        	
	            return new UfoEnemyShip();
	            
	        } 
	        
	        else if (newShipType.equals("R")){
	        	
	            return new RocketEnemyShip();
	            
	        } 
	        
	        else if (newShipType.equals("B")){
	            
	        	return new BigUfoEnemyShip();
	        }
	        
	        else return null;
	}
	
	
	
}
