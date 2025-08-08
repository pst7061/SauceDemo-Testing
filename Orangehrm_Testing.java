package Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Orangehrm_Testing { 

	public static void main(String[] args) {
            
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		driver.manage().window().maximize();
		WebElement dropdown1 = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(dropdown1);
		select.selectByValue("India");
		select.selectByVisibleText("Germany");
		
		
		WebElement dropdown2 = driver.findElement(By.name("NoOfEmployeees"));
		Select select1 = new Select(dropdown2);
		select1.selectByIndex(3);
		//select1.selectByValue("45");
		
		
		driver.findElement(By.name("FullName")).sendKeys("Pravin Savleram Thorat");
	    driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9874561230");
	    driver.findElement(By.name("Email")).sendKeys("pst7061@gmail.com");
	    driver.findElement(By.name("CompanyName")).sendKeys("TechSpiddz");
	    
	    
	    
		
	}

}
