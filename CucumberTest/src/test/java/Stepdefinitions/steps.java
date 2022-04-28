package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	@Given("user in google homepage")
	public void user_in_google_homepage() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium projects\\seleniumtestngprojects\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	    
	}
	@Given("google title test")
	public void google_title_test() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	  
	}
	@When("user in facebook home page")
	public void facebook_home_page() {
		driver.navigate().to("https://www.facebook.com/");
		 boolean b=driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		 Assert.assertTrue(b);
	   
	}
	@When("facebook title test")
	public void facebook_title_test() {
		String title1=driver.getTitle();
		 System.out.println(title1);
driver.quit();	
	  
	}


}
