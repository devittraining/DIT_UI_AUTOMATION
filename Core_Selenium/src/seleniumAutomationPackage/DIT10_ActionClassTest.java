package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT10_ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		
		WebElement homeGarden = driver.findElement(By.partialLinkText("Home"));
		
		Thread.sleep(3000);
		builder.moveToElement(homeGarden).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}