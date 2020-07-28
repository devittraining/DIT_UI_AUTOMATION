package seleniumAutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT14_AttributeTest {

	public static void main(String[] args) {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.ebay.com/");	//opening any URL
		
		String attributeValue = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).getAttribute("placeholder");
		System.out.println(attributeValue);
		
		if(attributeValue.equals("Search for anything"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		
		driver.close();
	}

}