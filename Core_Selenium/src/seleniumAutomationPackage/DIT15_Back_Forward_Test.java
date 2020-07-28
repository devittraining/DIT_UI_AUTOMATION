package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT15_Back_Forward_Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.google.com/?gws_rd=ssl");	//opening any URL
		
		/**************************** Click on About *******************************/
		driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]")).click();
		Thread.sleep(2000);
		
		/**************************** Click on Back button *************************/
		driver.navigate().back();
		Thread.sleep(2000);
		
		/**************************** Click on Forward button *************************/
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		driver.close();
		

	}

}