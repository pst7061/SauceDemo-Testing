package Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Basic_Automation {  
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		/*driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.name("checkBoxOption2")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("checkBoxOption2")).click();
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();*/
		/*String Actualresult =  driver.getTitle();
		System.out.println("Actual title = "+Actualresult);
		String Expectedresult = "Practice Page";
		System.out.println("Expected title = "+Expectedresult);
		if(Actualresult.equalsIgnoreCase(Expectedresult))
	    {
			System.out.println("Title test case passed");
			
		}
		else
		{
			System.out.println("Title test case failed");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(dropdown1);
		dropdown.selectByIndex(2);
		dropdown.selectByValue("option1");
		dropdown.selectByVisibleText("Option3");
		dropdown.deselectByIndex(2);
	
	*/
	/*	//Alert
		driver.findElement(By.id("name")).sendKeys("Pravin");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		//driver.switchTo().alert().dismiss();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		//driver.switchTo().alert().sendKeys("Welcome to techworld");
		*/
		
		/*driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		String original_window = driver.getWindowHandle();
		System.out.println(original_window);
		Set<String> available_window= driver.getWindowHandles();
		System.out.println(available_window);
		for(String windowId : available_window)
		{
			if(windowId != original_window)
			{
				driver.switchTo().window(windowId);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
			}
		}*/
		//access all our courses select //info@qaclickacademy.com ----info@qaclickacademy.in  compare two string console pass/ fail output
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 800).build().perform();
		WebElement mourse_hover = driver.findElement(By.id("mousehover"));
		act.moveToElement(mourse_hover).build().perform();
		
//		WebElement Top = driver.findElement(By.xpath("//a[@href='#top']"));  //          // tagname[@attribute='value']  ---> xpathsyntax  
//		                                                                              //1.absolute xpath---single /
//		                                                                              //.relative xpath---double //
//		act.click(Top).build().perform();
//		act.contextClick().build().perform();
		
	    WebElement Reload = driver.findElement(By.xpath("//a[@href='#reload']"));
	    act.click(Reload).build().perform();
	}
	//internet.herokuapp.com drag and drop
}