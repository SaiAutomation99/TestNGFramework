package com.verify.testng;

import org.testng.Assert;
import org.testng.annotations.Test;




public class RetryLogic {
	
	
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void m1() {
		
		Assert.assertEquals(true, true);
		
	}
	
	@Test
	public void m2() {
		
		Assert.assertEquals(true, true);

	}

}
