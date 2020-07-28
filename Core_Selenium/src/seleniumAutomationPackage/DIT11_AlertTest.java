package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT11_AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		//Accept Cookies
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		
		//Click on "Simple Alert" button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		
		Thread.sleep(10000);
		
		// Performing Alert actions
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());	// Get the alert message
		
		Thread.sleep(4000);
		
		al.accept();
		//al.dismiss();
		
		driver.quit();
	}

}