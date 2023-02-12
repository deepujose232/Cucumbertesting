package loginparameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remember {
	WebDriver driver;
	@Given("User must be on home page, by clicking url {string}")
	public void user_must_be_on_home_page_by_clicking_url(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(string);
	    Thread.sleep(2000);
	   
	}

	@When("user clicks on remember me check box")
	public void user_clicks_on_remember_me_check_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label > input")).click();
		Thread.sleep(2000);
		
	   
	}

	@Then("checkbox must be selected")
	public void checkbox_must_be_selected() {
	    // Write code here that turns the phrase above into concrete actions
		boolean a=driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label > input")).isSelected();
	    System.out.println(a);
	    driver.quit();
	}

}

