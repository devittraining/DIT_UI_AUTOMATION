package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT13_DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		driver.get("http://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		System.out.println("Before Drop : " + droppable.getText());
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		System.out.println("After Drop : " + droppable.getText());
		
		if(droppable.getText().equals("Dropped!"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}