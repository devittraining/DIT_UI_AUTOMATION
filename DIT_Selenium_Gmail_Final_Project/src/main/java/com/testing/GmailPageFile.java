package com.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class GmailPageFile extends GmailLocatorsFile implements GmailDataFile{

	public WebDriver driver = null;
	public WebDriverWait wait;
	public String actualErrMsg, expectedErrMsg, tooltip, totalUnreadEmailCount;
	public String emailCountFirstPage, emailTotalCount;
	public Actions builder;
	
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
		wait = new WebDriverWait(driver,100);
		builder = new Actions(driver);
		
		PageFactory.initElements(driver, this);	

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	public void openURL() throws Exception {	
		
		driver.get(URL);	//opening any URL
		Thread.sleep(2000);
		
	}
	
    public void loginWithInvalidEmail() throws InterruptedException {
	   	
    	wait.until(ExpectedConditions.visibilityOf(emailTextField)).sendKeys(invalidEmail);
    	wait.until(ExpectedConditions.visibilityOf(emailNextBtn)).click();
    	
    	actualErrMsg = wait.until(ExpectedConditions.visibilityOf(wrongEmailActualErrorMsg)).getText();
    	expectedErrMsg = wrongEmailErrorMsg;
    	
	    Assert.assertEquals(expectedErrMsg, actualErrMsg);
	   	
    }
	
    public void loginWithInvalidPassword() throws InterruptedException {
	   	
    	wait.until(ExpectedConditions.visibilityOf(emailTextField)).sendKeys(validEmail);
    	wait.until(ExpectedConditions.visibilityOf(emailNextBtn)).click();
    	
    	wait.until(ExpectedConditions.visibilityOf(passwordTextField)).sendKeys(invalidPassword);
    	wait.until(ExpectedConditions.visibilityOf(passwordNextBtn)).click();
    	
    	actualErrMsg = wait.until(ExpectedConditions.visibilityOf(wrongPasswordActualErrorMsg)).getText();
    	expectedErrMsg = wrongPasswordErrorMsg;
    	
	    Assert.assertEquals(expectedErrMsg, actualErrMsg);
	   	
    }
    
	public void loginWithValidCredentials() {
		
	   	wait.until(ExpectedConditions.visibilityOf(emailTextField)).sendKeys(validEmail);
    	wait.until(ExpectedConditions.visibilityOf(emailNextBtn)).click();
    	
    	wait.until(ExpectedConditions.visibilityOf(passwordTextField)).sendKeys(validPassword);
    	wait.until(ExpectedConditions.visibilityOf(passwordNextBtn)).click();
		
	}
	
	public void emailsCount() {
		
		emailCountFirstPage = wait.until(ExpectedConditions.visibilityOf(firstPageEmailCount)).getText();
		System.out.println("Emails Count on First Page : " + emailCountFirstPage);
		
		emailTotalCount = wait.until(ExpectedConditions.visibilityOf(totalEmailCount)).getText();
		System.out.println("Total Emails Count : " + emailTotalCount);
		
	}
	
	public void moveEmailFromInboxToTrash() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(selectEmailFromInbox)).click();
		wait.until(ExpectedConditions.visibilityOf(moveToTrashBtn)).click();
		wait.until(ExpectedConditions.visibilityOf(trashOptionFromMoveTo)).click();
		
		System.out.println("\n" + "************ Email Counts After Moving ONE Email from Inbox to Trash ************");
    
	}
	
	public void moveEmailFromTrashToInbox() {
			
		wait.until(ExpectedConditions.visibilityOf(moreOptionFromMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(trashOptionFromMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(selectEmailFromTrash)).click();
		wait.until(ExpectedConditions.visibilityOf(moveToInboxBtn)).click();
		wait.until(ExpectedConditions.visibilityOf(inboxOptionFromMoveTo)).click();
		wait.until(ExpectedConditions.visibilityOf(lessOptionFromMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(inboxFromMenu)).click();
 
		System.out.println("\n" + "************ Email Counts After Moving ONE Email from Inbox to Trash ************");
	    
	}
	
	public void readUnreadEmail() throws InterruptedException {
		
		builder.moveToElement(emailDate).build().perform();
		tooltip = wait.until(ExpectedConditions.visibilityOf(readUnreadEmailButton)).getAttribute("data-tooltip");
		System.out.println(tooltip);
		
		wait.until(ExpectedConditions.visibilityOf(readUnreadEmailButton)).click();
		builder.moveToElement(readUnreadEmailCount).build().perform();
		Thread.sleep(1000);
		totalUnreadEmailCount = wait.until(ExpectedConditions.visibilityOf(readUnreadEmailCount)).getText();
		System.out.println("Total Unread Emails after click on MARK AS READ button : " + totalUnreadEmailCount);
		
		builder.moveToElement(emailDate).build().perform();
		tooltip = wait.until(ExpectedConditions.visibilityOf(readUnreadEmailButton)).getAttribute("data-tooltip");
		System.out.println(tooltip);
		
		wait.until(ExpectedConditions.visibilityOf(readUnreadEmailButton)).click();
		builder.moveToElement(readUnreadEmailCount).build().perform();
		Thread.sleep(1000);
		totalUnreadEmailCount = wait.until(ExpectedConditions.visibilityOf(readUnreadEmailCount)).getText();
		System.out.println("Total Unread Emails after click on MARK AS UNREAD button : " + totalUnreadEmailCount);
		
	}
	
}