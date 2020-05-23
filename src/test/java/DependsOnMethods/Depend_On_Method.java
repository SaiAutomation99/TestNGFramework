package DependsOnMethods;

import org.testng.annotations.Test;

public class Depend_On_Method {
	
	
	@Test
	public void m2() {
		
		System.out.println("m1 method");
		
	}
	
	
	
	
	@Test(dependsOnMethods = "m2")
	public void m1() {
		
		System.out.println("m2 method");
	}

}
