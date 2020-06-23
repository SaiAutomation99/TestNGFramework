package ExpectedException;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void m1() {
		
		System.out.println("m1 method");
		throw new ArithmeticException();
		
	}
}
