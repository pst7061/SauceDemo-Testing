package Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_tables {
	public static void main(String[] args) throws InterruptedException {
		        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='India']")).click();
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 800).build().perform();
/*		
       table_row
       List<WebElement> row = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr"));
		int row_count=row.size();
	    System.out.println(row_count);
		  for(WebElement row_data:row)
		    {
		    	String data = row_data.getText();
		    	System.out.println(data);
		    }*/

	  /*  Table_head
	   * List<WebElement> heading = driver.findElements(By.xpath("//div[@class='tableFixHead']//th"));
	    int heading_count = heading.size();
	    System.out.println(heading_count);
	    
	  		
	    for(WebElement heading_data:heading)
	    {
	    	String data = heading_data.getText();
	    	System.out.println(data);
	    }*/
	   /* List<WebElement> td = driver.findElements(By.xpath("//div[@class='tableFixHead']//td"));
	    int td_count = td.size();
	    System.out.println(td_count);
	    
	  		
	    for(WebElement td_data:td)
	    {
	    	String data = td_data.getText();
	    	System.out.println(data);
	    }*/
	     
      WebElement element = driver.findElement(By.xpath("//div[@class='tableFixHead']//tr[3]/td[2]"));
        System.out.println(element.getText());
		
		//WebElement element= driver.findElement(By.xpath("//div[@class='tableFixHead']//tr[3]/td[2]"));
		String expected_result="manager";
		String actual_result=element.getText();
		if(expected_result.equalsIgnoreCase(actual_result)) {
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
       
	}

}
