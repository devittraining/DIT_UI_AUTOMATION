package com.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPageFile extends GmailLocatorsFile implements GmailDataFile{

	
	public WebDriver driver;
	
	public void openBrowser() throws IOException, InterruptedException {
		
	
		//Opening Chrome Browser
		File dr = new File("gmailProjectData");	   
		File chromeDriver = new File(dr, "chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());		
		driver = new ChromeDriver();
	
	/*	
		//Opening Firefox Browser
		File dr = new File("gmailProjectData");	   
		File geckoDriver = new File(dr, "geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", geckoDriver.getAbsolutePath());		
		driver = new FirefoxDriver();
	*/	
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
	
	public void loginWithValidCredentials() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		
	}
	
}