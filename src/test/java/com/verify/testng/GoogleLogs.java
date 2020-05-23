package com.verify.testng;

import org.testng.annotations.Test;

public class GoogleLogs extends BaseClass{
	
	
	
	@Test
	public void googleLogs() {
		
		driver.get("https://www.google.com/");

		driver.quit();		
		
		
	}

}
