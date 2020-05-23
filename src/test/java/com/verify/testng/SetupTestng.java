package com.verify.testng;

import org.testng.annotations.Test;

public class SetupTestng {
	
	
	
	@Test(priority = 0)
	public void m1() {
		System.out.println("Hanuman");
		
	}
	
	
	@Test(priority =1)
	public void m2() {
		
		System.out.println("test 2");
	}

}
