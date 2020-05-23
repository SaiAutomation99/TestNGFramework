package com.verify.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter=0;
	int count=3;

	public boolean retry(ITestResult result) {
		
		if(counter<count) {
			counter++;
			return true;
		}
		return false;
	}
	
	
	
	
	

}
