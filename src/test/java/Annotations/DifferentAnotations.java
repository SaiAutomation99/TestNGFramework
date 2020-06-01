package Annotations;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnotations {



	@BeforeSuite
	public void BeforeSuite() {

		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void afterSuite() {

		System.out.println("@AfterSuite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("@BeforeClass");

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("@BeforeMethod");

	}

	@Test
	public void test() {

		System.out.println("test1");
	}
	@Test
	public void test2() {

		System.out.println("test1");
	}



}
