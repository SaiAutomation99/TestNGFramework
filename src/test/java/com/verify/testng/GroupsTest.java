package com.verify.testng;

import org.testng.annotations.Test;

public class GroupsTest {
	
	@Test(groups = {"sai"})
	public void groupTest() {
		
		System.out.println("group test");
	}
	
	
	@Test(groups = {"sai1"})
	public void groupTest1() {
		
		System.out.println("groupTest2");
	}

}
