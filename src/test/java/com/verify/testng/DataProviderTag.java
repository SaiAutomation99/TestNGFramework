package com.verify.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTag {
	
	
	@DataProvider(name="sai")
	public Object[][] data() {
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="sai1";
		obj[0][1]="sai2";
		obj[1][0]="sai3";
		obj[1][1]="sai4";

		
		return obj;
		
	}
	
	
	@Test(dataProvider="sai")
	public void m1(Object obj,Object oibh) {
		
		System.out.println(obj);
		System.out.println(oibh);
		
		
	}
	
}
