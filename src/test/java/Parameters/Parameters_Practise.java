package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Practise {
	
	
	
	@Test
	@Parameters({"browser"})
	public void parameters_demo(String browsername) {
		
		System.out.println(browsername);
		if(browsername.equalsIgnoreCase("google")) {
			
			System.out.println("enters google");
		}else if (browsername.equalsIgnoreCase("ie")) {
			System.out.println("ie browser");
			
		}
		
	}

}
