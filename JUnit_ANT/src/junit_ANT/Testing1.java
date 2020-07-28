package junit_ANT;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass // Run only once initial in the class // It contains static method
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I am in Before Class");
	}

	@AfterClass // Run only once at last in the class // It contains static method
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I am in After Class");
	}

	@Before // Run every time before any Test
	public void setUp() throws Exception {
		System.out.println("I am in Before");
		System.out.println("Login");
	}

	@After // Run every time after any Test
	public void tearDown() throws Exception {
		System.out.println("I am in After");
		System.out.println("Logout");
	}
	
	@Test // This annotation is mandatory
	public void test1() {
		System.out.println("I am in Test1");
	}

}