package Groups;

import org.testng.annotations.Test;

public class Groups_Practise {
	
	
	
	@Test(groups = "groupname")
	public void groupsname1() {
		
		System.out.println("groupsname1");
		
	}
	
	@Test(groups = "groupname")
	public void groupsname2() {
		
		System.out.println("groupsname2");
		
	}
	@Test(groups = "groupname1")
	public void groupsname3() {
		
		System.out.println("groupsname2");
		
	}

}
