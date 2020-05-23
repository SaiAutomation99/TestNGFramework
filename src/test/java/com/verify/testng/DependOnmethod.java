package com.verify.testng;

import org.testng.annotations.Test;

public class DependOnmethod {
	
	
	
	@Test
	public void m2() {
		
		System.out.println("m2 method");
	}
	
	
	@Test(dependsOnMethods = "m2")
	public void m1() {
		
		System.out.println("m1 method");
		
	}
	
	
	@Test(enabled = false)
	public void m3() {
		System.out.println("m3 method");
		
	}
}
