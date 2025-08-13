package Automation_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemoTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl, expectedUrl, "Login Failed ❌");
        System.out.println("✅ Valid Login Test Passed");
    }

    @Test
    public void invalidLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        username.clear();
        password.clear();

        username.sendKeys("invalid_user");
        password.sendKeys("wrong_password");
        loginBtn.click();

        try {
            WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='error']")));
            Assert.assertTrue(errorMsg.isDisplayed(), "❌ Error message not displayed");
            System.out.println("✅ Invalid Login Test Passed. Error: " + errorMsg.getText());
        } catch (Exception e) {
            Assert.fail("❌ Error message not found within timeout. Test failed.");
        }
    }


    @Test
    public void addToCartTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        WebElement cartBadge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_badge")));
        Assert.assertEquals(cartBadge.getText(), "1", "❌ Item not added to cart!");
        System.out.println("✅ Add to Cart Test Passed.");
    }

    @Test
    public void logoutTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Menu button open करा
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement menuBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
        menuBtn.click();

        // थोडा वेळ द्या menu open होण्यासाठी
        Thread.sleep(2000); // 👈 हे wait हवेच आहे कारण menu खुलं व्हायला थोडा वेळ लागतो

        // Logout क्लिक करा
        WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logoutLink.click();

        // Verify की logout झालं का (login page URL check)
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "❌ Logout failed X");

        System.out.println("✅ Logout Test Passed. Current URL: " + actualUrl);
    }


//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
