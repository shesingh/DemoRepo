/*
 * Regular expression \"(.*)\" means value is parameterized and coming from feature file.
 * Another regular expression \"([^\"]*)\"can be used
 * Ctrl+O to do all the imports
 * 
 */

package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	public String projectPath = System.getProperty("user.dir");


	


	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@When("^Page title is facebook$")
	public void page_title_is_facebook(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook - Log In or Sign Up", title);

	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password)  {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@id='u_0_2']")).sendKeys(Keys.RETURN);	
	}

	@Then("^user in on homepage$")
	public void user_in_on_homepage(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("(7) Facebook", title);
	}	

	/*@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/




}
