package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

	WebDriver driver; // creating object of WebDriver Class
	
	@BeforeMethod
	public void openBrowserOpenURL() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "F:\\DEV_IT_Training\\DIT_Selenium\\TestNG_Maven\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		
		driver.get("https://www.google.com/");	//opening any URL
		
		Thread.sleep(2000);
		
	}
			
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
		
	}
	
    @Test
    public void attributeTest() throws InterruptedException
    {
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]")).click();
        
    }
    
}
