package seleniumAutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT02_WebDriverWebElement {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver; // creating object of WebDriver Class
		WebElement email, password, login; // creating object of WebElement class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		driver.manage().deleteAllCookies(); // Delete cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); // Give timeout to load the page
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,100);
	
		driver.get("https://www.facebook.com/");	//opening any URL
		
		Thread.sleep(1000);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// <WebElement> = driver.findElement(By.<Locator>());
		
		email = driver.findElement(By.id("email"));	// locate or finding any element
		//Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeSelected(email));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("TestEmail");
		
		//email.click();
		//email.clear();
		email.sendKeys("testEmail");	// passing any String value in Text Field
		
		//Thread.sleep(2000);
		
		password = driver.findElement(By.id("pass"));
		password.sendKeys("testPassword");
		
		login = driver.findElement(By.id("loginbutton"));
		login.click();
		//login.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}