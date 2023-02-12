package loginparameterization;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_para {
WebDriver driver;
	
	@Given("User must be on home page, by clicking url {string}")
public void user_must_be_on_home_page_by_clicking_url(String string) {
    // Write code here that turns the phrase above into concrete actions
    
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	    
	}

	@When("^Enter valid (.*) & (.*)$")
	public void enter_valid_username_password(String Username, String Password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	   driver.findElement(By.id("username")).sendKeys(Username);
	   Thread.sleep(2000);
	   driver.findElement(By.id("password")).sendKeys(Password);
	}

	@When("click on signin button")
	public void click_on_signin_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("log-in")).click();
		 Thread.sleep(2000);
		
		
	}

	@Then("user must be navigated to the account")
	public void user_must_be_navigated_to_the_account() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    String actual=driver.getCurrentUrl();
	    Assert.assertEquals("https://demo.applitools.com/app.html",actual);
	driver.quit();
	}


}
