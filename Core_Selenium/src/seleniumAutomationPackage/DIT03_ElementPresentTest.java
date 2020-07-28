package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT03_ElementPresentTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.google.com/");

		/******************************* First Way *********************************/
		
		List<WebElement> element = driver.findElements(By.linkText("facebook"));
		System.out.println(element.size());
		
		if(element.size()>0)
			System.out.println("Element Present");
		else
			System.out.println("Element not Present");


		
		List<WebElement> element1 = driver.findElements(By.linkText("About"));
		System.out.println(element1.size());
		
		if(element1.size()>0)
			System.out.println("Element Present");
		else
			System.out.println("Element not Present");
		
		
		
		
		/******************************* Second Way ********************************/
		
		
		if(driver.findElement(By.linkText("About")).isDisplayed())
			System.out.println("Element Present");
		else
			System.out.println("Element not Present");
	
		
		driver.quit();
	}

}