package seleniumAutomationPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIT12_FrameTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver; // creating object of WebDriver Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Core_Selenium\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("http://jqueryui.com/droppable/");
		
		List<WebElement> Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		
		if(Sortable.size()>0)
			System.out.println("Sortable Link Present");
		else
			System.out.println("Sortable Link not Present");

		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0)
			System.out.println("Drag me Box Present");
		else
			System.out.println("Drag me Box not Present");
		
		
		
	
		
		System.out.println("------------------ Switch to Frame -----------------------");
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(""); // only works for ID --- In this case ID is not present for Frame tag.
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.switchTo().parentFrame(); ---- switch to Parent Frame of the current frame.
		
		Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0)
			System.out.println("Sortable Link Present");
		else
			System.out.println("Sortable Link not Present");

		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0)
			System.out.println("Drag me Box Present");
		else
			System.out.println("Drag me Box not Present");
		
		
		
	
		
		
		System.out.println("------------------ Switch to Default Page -----------------------");
		
		driver.switchTo().defaultContent();
		
		Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0)
			System.out.println("Sortable Link Present");
		else
			System.out.println("Sortable Link not Present");

		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0)
			System.out.println("Drag me Box Present");
		else
			System.out.println("Drag me Box not Present");
		
		
		driver.quit();
		
	}

}