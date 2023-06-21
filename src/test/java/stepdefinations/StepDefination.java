package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefination {
	 WebDriver driver;
	
	@Given("I am logged in to LinkedIn")
	public void i_am_logged_in_to_linked_in() throws Exception {
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(ops);
	    driver.manage().window().maximize();
	    driver.get("https://www.linkedin.com/login");
	    WebElement emailField = driver.findElement(By.xpath("//input[@id='username']"));
	    emailField.sendKeys("naveen95267@gmail.com");
	    WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
	    passwordField.sendKeys("Naveen@123");
	    WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    signInButton.click();
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("software engineer",Keys.ENTER);
	    //driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("keyword",Keys.ENTER);
	    //Assert.assertEquals("LinkedIn Login, Sign in | LinkedIn",driver.getTitle());
	    //driver.wait(100);
	    //driver.quit();
	    
	}
	@When("I search for a job with keyword {string} and location {string}")
	public void i_search_for_a_job_with_keyword_and_location(String keyword, String location) throws Exception {
		
		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(4000);
		WebElement searchField = driver.findElement(By.xpath("//input[@aria-label='Search by title, skill, or company']"));
	    searchField.sendKeys(keyword,Keys.ENTER);
	    
	    
//	    WebElement locationField = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[2]"));
//	    locationField.sendKeys(location,Keys.ENTER);
	    //WebElement searchButton = driver.findElement(By.xpath("//button[@type='button']"));
	    //searchButton.click();
	    
	}
	
	
	@When("I search for a company with keyword {string}")
	public void i_search_for_a_company_with_keyword(String string) throws Exception {
		driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(string,Keys.ENTER);
	    driver.close();
	}
	@Then("I should see the company page for Google")
	public void i_should_see_the_company_page_for_google() {
	    
	}
	
	@When("I search for a friend with keyword {string}")
	public void i_search_for_a_friend_with_keyword(String string) {
	    
	}
	@When("I send a connection request to John Doe")
	public void i_send_a_connection_request_to_john_doe() {
	    
	}
	@Then("John Doe should receive my connection request")
	public void john_doe_should_receive_my_connection_request() {
	    
	}

}
