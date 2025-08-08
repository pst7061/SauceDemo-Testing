package Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemo_LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        driver.get("https://www.saucedemo.com/");

        // username आणि password टाका
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // लॉगिन क्लिक करा
        driver.findElement(By.id("login-button")).click();

        // verification: URL check करा
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login Failed ❌");

        // Title verify करा
        String title = driver.getTitle();
        Assert.assertEquals(title, "Swag Labs", "Title mismatch ❌");

        System.out.println("✅ Login Test Passed. URL: " + actualUrl);
    }

    /*@Test
    public void invalidLoginTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMsg = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(errorMsg.isDisplayed(), "❌ Error message not displayed!");
        System.out.println("✅ Invalid Login Test Passed. Error: " + errorMsg.getText());
    }
*/
    
    @Test
    public void addToCartTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals(cartBadge.getText(), "1", "❌ Item not added to cart!");
        System.out.println("✅ Add to Cart Test Passed.");
    }
    
    @Test
    public void logoutTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);  // Wait for menu to open
        driver.findElement(By.id("logout_sidebar_link")).click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("saucedemo.com"), "❌ Logout Failed!");
        System.out.println("✅ Logout Test Passed. URL: " + currentUrl);
    }


//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
