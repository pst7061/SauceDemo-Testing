package Automation_Testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Window {
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//buttton[@id='openwindow']")).click();
		String original_window = driver.getWindowHandle();
		System.out.println(original_window);
		Set<String> available_window= driver.getWindowHandles();
		System.out.println(available_window);
	}
}
