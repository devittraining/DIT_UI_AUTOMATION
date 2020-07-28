package seleniumAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DIT16_CssSelectorTest {

	public static void main(String[] args) {

		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("fsfasg");
		driver.findElement(By.cssSelector("#pass")).sendKeys("dfdfdsf");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.quit();
		
	}

}