package seleniumAutomationPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DIT01_FacebookLandingPage {

	public static void main(String[] args) throws InterruptedException {
		
		//FirefoxDriver driver = new FirefoxDriver();	// Open Firefox Browser
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Open URL - driver.get();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//driver.close();	// Close the tab of browser
		driver.quit();	// Close all tabs of browser

	}
	
}
