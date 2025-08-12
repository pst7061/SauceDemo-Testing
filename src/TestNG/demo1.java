package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo1 {  
	
    @Parameters({"username", "password"})
    @Test
	void logintestcase(String username, int password) {  
		System.out.println("username= "+username);
		System.out.println("password= "+password);
		
	}
    
    @Parameters
    void logintestcase2(String username, int password)  { 
    	System.out.println("username= "+username);
		System.out.println("password= "+password);
    }

}
