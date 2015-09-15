package com.psl.pattern;

public class ManageStation {

	/**
	 * @param args singletonclass1 and singletonclass2 are singletonClass objects.
	 *
	 */
	
	
	public static void main(String[] args) {
		
		// SingletonClass constructor is not visible.
		// SingletonClass singletonclass = new SingletonClass();
		
		
		SingletonClass singletonclass1 = SingletonClass.getInstance();
		
		System.out.println("Singleton object obtained");
		
		SingletonClass singletonclass2 = SingletonClass.getInstance();
		
		System.out.println("Singleton  object obtained");
	}
}
