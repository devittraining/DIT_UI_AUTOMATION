package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT05_GoogleFooterLink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.google.com/?gws_rd=ssl");	//opening any URL
		
		Thread.sleep(2000);
		
		/**************************** Footer Part I *********************************/
		System.out.println("\n\n" + "Footer Part I .....");
		List<WebElement> footerLink1 = driver.findElements(By.xpath("//*[@id=\"fsl\"]/a"));
		
		System.out.println("Footer1 Links : " + footerLink1.size());
		
		for(WebElement ele : footerLink1)
			System.out.println(ele.getText());
		
	
		/**************************** Footer Part II *********************************/
		System.out.println("\n\n" + "Footer Part II .....");
		List<WebElement> footerLink2 = driver.findElements(By.xpath("//*[@id=\"fsr\"]/a"));
		
		System.out.println("Footer2 Links : " + footerLink2.size());
		
		for(WebElement ele : footerLink2)
			System.out.println(ele.getText());
		
		
		/**************************** All Links *********************************/
		System.out.println("\n\n" + "All Links .....");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links : " + allLinks.size());
		
		for(WebElement ele : allLinks)
			System.out.println(ele.getText());
		
	
		
		driver.close();
		

	}

}