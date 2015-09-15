package com.psl.pattern;

public class SingletonClass {

	/**
	 * create a SingletonClass variable 
	 * and initilize it to null value
	 */
	private static SingletonClass singletonInstance = null;
	/**
	 * initilize flag to false 
	 */
	public boolean flag = false;
	
	
	/**
	 * default constructor of SingletonClass
	 * private constructor prevents any other class from instantiating
	 */
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * getInstance method check whether singleInstance is null
	 * if it is null then create a new instance of this class
	 * @return singleInstance
	 */
	public static SingletonClass getInstance(){
		if(singletonInstance==null){
			
				singletonInstance = new SingletonClass();
				 System.out.println("Creating new instance");

			
		}
		return singletonInstance;
	}
	
	/**
	 * @param Take flagToSet value as boolean 
	 * assign it to flag
	 */
	public void chnageFlag(boolean flagToSet){
		flag=flagToSet;
	}
	
	
}
