package seleniumAutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DIT06_KeysTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\DEV_IT_Training\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.findElement(By.xpath(".//*[@id='identifierId']")).click();
		//driver.findElement(By.xpath(".//*[@id='identifierId']")).clear();
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("tarak7929@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("fhaskjfa");
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	
		driver.quit();
		
	}

}

