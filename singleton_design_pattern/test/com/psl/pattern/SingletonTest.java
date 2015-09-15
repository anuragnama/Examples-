package com.psl.pattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {
	
	
private SingletonClass obj;
	
	@Before
	public void setUp() {
		obj = SingletonClass.getInstance();
	}
	
	
	@Test	
	public void singleton_test_success(){
		
		SingletonClass instance1= SingletonClass.getInstance();
		SingletonClass instance2= SingletonClass.getInstance();
		
		System.out.println("checking Singleton object equality");
		Assert.assertEquals(true, instance1==instance2);
		
	}
	
	@Test
	public void checkFlagChange(){
		
		System.out.println(obj.flag);
		obj.chnageFlag(true);
		Assert.assertEquals(true, obj.flag);
		
	}
	
}
