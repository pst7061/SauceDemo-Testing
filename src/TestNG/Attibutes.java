package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Attibutes {     
	//@test
	//precondition annotatino-before suite, before test, before class, before method
	//postcondtion annotation - after suite, after test, class, method
	//excecution flow - alphabetical order
	//invocationCount - single statement executes 
	//
	@BeforeSuite
	void beforesuite() {
		System.out.println("test executes before suites");
	}
	
	@Test
	void A() {
		System.out.println("Test A");
	}
	
	@Test
	void B() {
		System.out.println("Test B");
	}
	
	@Test
	void C() {
		System.out.println("Test C");
	}
	
	@AfterSuite
	void aftersuite() {
		System.out.println("test executes after suites");
	}
	
	

}
