package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practise {
	
	
	
	@DataProvider(name= "dataprovider")
	public 	Object[][] dataProvider() {
		
		Object[][] j=new Object[2][3];
		
		j[0][0]="s";
		j[0][1]="w";
		j[0][2]="ki";
		j[1][0]="s";
		j[1][1]="w";
		j[1][2]="ki";
		
		return j;
		
		
	}
	
	@Test(dataProvider = "dataprovider")
	public void testDataProvider(Object k,Object a,Object l) {
		
		System.out.println(k.toString());
		System.out.println(a.toString());
		System.out.println(l.toString());
		
	}

}
