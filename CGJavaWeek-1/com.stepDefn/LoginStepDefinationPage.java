package CGJavaWeek_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinationPage {
//	WebDriver driver;
//
//@Given("I want to open the browser")
//public void i_want_to_open_the_browser() {
//	driver= new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//}
//
//@When("I will enter {string} and {string} in the login page")
//public void i_will_enter_and_in_the_login_page(String string, String string2) {
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
//	   driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys(string2);
//}
//
//@When("click on login button")
//public void click_on_login_button() {
//	driver.findElement(By.xpath("//button[@name='login']")).click();
//}
//
//@Then("I will get the login confirmation page")
//public void i_will_get_the_login_confirmation_page() {
//    System.out.println("Login successfully");
//}
	
	@Given("I want to open the browser")
	public void i_want_to_open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I will enter {string} and {string} in the login page")
	public void i_will_enter_and_in_the_login_page(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I will get the login confirmation page")
	public void i_will_get_the_login_confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
