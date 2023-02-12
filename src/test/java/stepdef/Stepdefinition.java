package stepdef;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



 public class Stepdefinition {
	WebDriver driver;
	
	@Given("User should be on the home page by clicking URL {string}")
	public void user_should_be_on_the_home_page_by_clicking_url(String string) {
	   System.setProperty("webdriver.chome.driver","chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(string);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("signin2")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("signup dialog box should be displayed")
	public void signup_dialog_box_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[1]")).isDisplayed();
		//boolean result=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
		//System.out.println(result);
		
		Assert.assertEquals(true, result);
	   // throw new io.cucumber.java.PendingException();
		driver.quit();
	}

}
