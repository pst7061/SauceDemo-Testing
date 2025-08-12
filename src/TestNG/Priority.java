package TestNG;

import org.testng.annotations.Test;

public class Priority {   
	
	@Test(priority = 2)  //priority of running test 
	public void A() {
		System.out.println("A test");
	}
	
	@Test(priority = 1)
	public void B() {
		System.out.println("B test");
	}
	
	@Test(groups = "negative")
	public void C() {
		System.out.println("C test");
	}
	
	@Test(groups = "positive", description = "abc")
	public void D() {
		System.out.println("D test");
	}
	
	@Test(invocationCount = 5)  // how many times test case is run  
	public void E() {
		System.out.println("E test");
	}
	
	@Test(timeOut = 2000) // test case take time for more than given time--- then timeout 
	                        //atribute is use for throw exception
	public void F() throws InterruptedException  {
		Thread.sleep(3000);
		System.out.println("F test");
	}
	@Test(enabled = false)
	public void a() {
		System.out.println("a test");
	}

	
	@Test   //
	public void I() {
		System.out.println("I test");//d     kl        
	}
	
	@Test
	public void J() {
		System.out.println("J test");
	}
	

}
