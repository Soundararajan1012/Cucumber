package ReusableMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FacebookDefinition extends ReusableFacebook {
	@Given("facebook Url")
	public void facebook_url() {
	    getdriver();
	    loadurl("https:www.facebook.com/");
	    
	}
	@Given("username and password")
	public void username_and_password() {
		driver.manage().window.maximize();
	    WebElement username=driver.findElement(By.id("email"));
	    sendInput(username, "chinna321@gmail.com");
	    WebElement password=driver.findElement(By.id("pass"));
	    sendInput(password, "chinna321@");
	}
	@Then("click login button")
	public void click_login_button() {
	    WebElement login=driver.findElement(By.name("login"));
	    buttonclick(login);
	}

}
