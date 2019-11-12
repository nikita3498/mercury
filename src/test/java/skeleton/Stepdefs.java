package skeleton;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
WebDriver driver;
	
	@Given("user launches ChromeBrowser And navigates to application url")
	public void user_launches_ChromeBrowser_And_navigates_to_application_url() {
		System.setProperty("webdriver.gecko.driver","C:\\NexGen Testing Stream\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		  driver.manage().window().maximize();
	     driver.navigate().to("http://newtours.demoaut.com");
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String un) {
		//Actions a=new Actions(driver);
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String psd) {
	   driver.findElement(By.name("password")).sendKeys(psd);
	}

	@When("Click Signin")
	public void click_Signin() {
		driver.findElement(By.name("login")).click();
	   
	}

//	@Then("validates Login success")
//	public void validates_Login_success() {
//		Assert.assertTrue(driver.getTitle().contains("Find a flight"));
//		//driver.close();
//	   
//	}
	
	@Given("user loging to testmeapp using valid credentials")
	public void user_loging_to_testmeapp_using_valid_credentials() {
		System.out.println("Login");
	   
	}

	@Given("user searching for products available in catelog")
	public void user_searching_for_products_available_in_catelog() {
		System.out.println("Search");
	    
	}

	@Given("User adding products to cart")
	public void user_adding_products_to_cart() {
		System.out.println("Add to cart");
	    
	}

	@Given("User performing payment using netbanking")
	public void user_performing_payment_using_netbanking() {
		System.out.println("payment");
	    
	}
    @Given("User Performs logout")
    public void User_Performs_logout()
    {
    	System.out.println("logout");
    }

}
