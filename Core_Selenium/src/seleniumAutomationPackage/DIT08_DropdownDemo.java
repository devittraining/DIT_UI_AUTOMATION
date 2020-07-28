package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT08_DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.ebay.com/");	//opening any URL
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(12);
		Thread.sleep(2000);
		
		s.selectByValue("15032");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Art");
		Thread.sleep(2000);
		
		driver.close();
	}

}