package seleniumAutomationPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DIT09_RadioButtonTest {

	public static void main(String[] args) {
		
		WebDriver driver; // creating object of WebDriver Class
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(list.size());
	/*
		for(WebElement ele : list)
			System.out.println(ele.getAttribute("value") + "-----" + ele.isSelected());
		
		System.out.println("\n\n");
	*/	
		for(WebElement ele : list) {
			if(ele.isSelected())
				System.out.println(ele.getAttribute("value") + "-----" + ele.isSelected());
		}
		
		System.out.println("----------------------------------------------------------");
		
		list.get(2).click();
	/*	
		for(WebElement ele : list)
			System.out.println(ele.getAttribute("value") + "-----" + ele.isSelected());
	*/	
		for(WebElement ele : list) {
			if(ele.isSelected())
				System.out.println(ele.getAttribute("value") + "-----" + ele.isSelected());
		}
	
		driver.quit();
	}

}