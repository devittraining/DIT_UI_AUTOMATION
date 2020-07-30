package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSearch {

	WebDriver driver;

	@Given("^Open Chrome and Open Google$")
	public void open_Chrome_and_Open_Google() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\git\\DIT_Selenium\\Cucumber\\projectData\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(1000);

		driver.get("https://www.google.com/");	//opening any URL
		
	}

	//stepDefination for firstFeature.feature file
	@When("^I Search India$")
	public void i_Search_India() throws Exception {

		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		
	}

	@Then("^I got India Information$")
	public void i_got_India_Information() throws Exception {

    	if(driver.getCurrentUrl().contains("India"))
    		System.out.println("searchIndiaTest - PASS");
    	else
    		System.out.println("searchIndiaTest - FAIL");
    	
    	Thread.sleep(2000);
    	
    	driver.quit();
    	
	}
	
	@When("^I Search Canada$")
	public void i_Search_Canada() throws Exception {

		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("Canada");
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		
	}

	@Then("^I got Canada Information$")
	public void i_got_Canada_Information() throws Exception {

    	if(driver.getCurrentUrl().contains("Canada"))
    		System.out.println("searchCanadaTest - PASS");
    	else
    		System.out.println("searchCanadaTest - FAIL");
    	
    	Thread.sleep(2000);
    	
    	driver.quit();
	
	}

	//stepDefination for dataFeature.feature file
	@When("^I Search \"([^\"]*)\"$")
	public void i_Search(String searchCountry) throws Exception {

		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys(searchCountry);
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		
	}

	@Then("^I got \"([^\"]*)\" Information$")
	public void i_got_Information(String countryInfo) throws Exception  {

    	if(driver.getCurrentUrl().contains(countryInfo))
    		System.out.println("search" + countryInfo + "Test - PASS");
    	else
    		System.out.println("search" + countryInfo + "Test - FAIL");
    	
    	Thread.sleep(2000);
    	
    	driver.quit();
		
	}

}
