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
		pf.closeBrowser();
	}
	
    @Test
    public void loginWithValidCredentialsTest() throws InterruptedException
    {
    	pf.loginWithValidCredentials();
    }
    
 
}