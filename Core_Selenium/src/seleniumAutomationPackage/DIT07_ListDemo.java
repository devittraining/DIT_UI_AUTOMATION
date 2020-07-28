package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT07_ListDemo {

	public static void main(String[] args) {

		WebDriver driver; // creating object of WebDriver Class
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.ebay.com/");	//opening any URL
		
		List<WebElement> listDemo = driver.findElements(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li"));
		
		int i = listDemo.size();
		
		System.out.println("\n\n\n");
		
		System.out.println("List of Sell .....");
		
		for(int a=0; a<5; a++)
			System.out.println(listDemo.get(a).getText());
		
		System.out.println("\n\n\n");
		
		System.out.println("List of Tools & apps .....");
		
		for(int a=5; a<10; a++)
			System.out.println(listDemo.get(a).getText());
		
		System.out.println("\n\n\n");
		
		System.out.println("Full List .....");
		
		for(WebElement ele : listDemo)
			System.out.println(ele.getText());
		
		driver.close();

	}

}
