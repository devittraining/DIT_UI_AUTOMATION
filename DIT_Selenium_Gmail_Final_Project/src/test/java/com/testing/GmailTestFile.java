package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTestFile {
	
	GmailPageFile pf = new GmailPageFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println("\n\n" + "TEST NAME: " + result.getMethod().getMethodName() + "\n\n");
		pf.closeBrowser();
	}

    @Test (priority = 1)
    public void loginWithInValidEmailTest() throws InterruptedException
    {
    	pf.loginWithInvalidEmail();
    }
    
    @Test (priority = 2)
    public void loginWithInValidPasswordTest() throws InterruptedException
    {
    	pf.loginWithInvalidPassword();
    }
    
    @Test (priority = 3)
    public void loginWithValidCredentialsTest() throws InterruptedException
    {
    	pf.loginWithValidCredentials();
    }
    
    @Test (priority = 4)
    public void emailsCountTest() throws InterruptedException
    {
    	pf.loginWithValidCredentials();
    	pf.emailsCount();
    }
    
    @Test (priority = 5)
    public void movingEmailTest() throws InterruptedException
    {
    	pf.loginWithValidCredentials();
    	pf.moveEmailFromInboxToTrash();
    	pf.emailsCount();
    	pf.moveEmailFromTrashToInbox();
    	pf.emailsCount();
    }
    
    @Test (priority = 6)
    public void readUnreadEmailTest() throws InterruptedException
    {
    	pf.loginWithValidCredentials();
    	pf.readUnreadEmail();
    }
 
}