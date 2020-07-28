package com.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFile extends LocatorsFile implements DataFile{

	public WebDriver driver;
	
	public void openBrowser() throws IOException, InterruptedException {
		
		//Opening Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\PageObjectModal\\projectData\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		PageFactory.initElements(driver, this);	

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	public void openURL() throws Exception {	
		
		driver.get(URL);	//opening any URL
		Thread.sleep(2000);
		
	}
	
	public void searchIndia() throws InterruptedException {
		
	   	Thread.sleep(1000);
	   	searchField.sendKeys(searchIndia);	// driver.findElement()
	   	searchField.sendKeys(Keys.ENTER); // driver.findElement()
    	
    	Thread.sleep(1000);
    	
    	if(driver.getCurrentUrl().contains("India"))
    		System.out.println("searchIndiaTest - PASS");
    	else
    		System.out.println("searchIndiaTest - FAIL");
    	
	}
	
	public void searchCanada() throws InterruptedException {
		
    	Thread.sleep(1000);
    	searchField.sendKeys(searchCanada);	// driver.findElement()
    	searchField.sendKeys(Keys.ENTER);	// driver.findElement()
    	
    	Thread.sleep(1000);
    	
    	if(driver.getCurrentUrl().contains("Canada"))
    		System.out.println("searchCanadaTest - PASS");
    	else
    		System.out.println("searchCanadaTest - FAIL");
    	
	}
	
	
	
}