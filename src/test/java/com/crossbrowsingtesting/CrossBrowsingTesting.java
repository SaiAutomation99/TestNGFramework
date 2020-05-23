package com.crossbrowsingtesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.verify.testng.BaseClass;

public class CrossBrowsingTesting extends BaseClass{
	
	
	
	@Test
	@Parameters("browser")
	public void crossBrowsingTesting(String name) {
		
		driver.get("https://www.google.com/");
		System.out.println(name);
		driver.quit();	
	}

}
