package seleniumAutomationPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT17_ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("http://www.mississauga.ca/portal/home");
		
		//File scrFile = driver.getScreenshotAs(OutputType.FILE);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		// Cascading
		FileUtils.copyFile(scrFile, new File("C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\outputFiles\\screenshot.png"));
		
		driver.close();
	}

}