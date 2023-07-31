package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Definition extends ReusableMethod{
	public pom pom1;
	@Given("user needs to launch the url")
	public void user_needs_to_launch_the_url() {
//	    ChromeOptions co=new ChromeOptions();
//	    co.addArguments("--remote-allow-origins=*");
//	    driver=new ChromeDriver(co);
//	    driver.manage().window().maximize();
//	    driver.get("https://www.facebook.com");
		//Reusable and hooks
//		getdriver();
//	    loadurl("https:www.facebook.com/");   
	}
	@Given("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    WebElement username= driver.findElement(By.id("email"));
//	    username.sendKeys("rajan123@gmail.com");
//	    WebElement password=driver.findElement(By.id("pass"));
//	    password.sendKeys("rajan123@");
		//Reusable
//		 WebElement username=driver.findElement(By.id("email"));
//		    sendInput(username, "chinna321@gmail.com");
//		    WebElement password=driver.findElement(By.id("pass"));
//		    sendInput(password, "chinna321@");
		//pom
		pom1=new pom();
		sendInput(pom1.getUsername(), "rajan123@gmail.com");
		sendInput(pom1.getPassword(), "rajan123@");	
	}
	@Then("user Click the submit button")
	public void user_click_the_submit_button() {
//	    WebElement login=driver.findElement(By.name("login"));
//	    login.click();
		//Reusable
//		WebElement login=driver.findElement(By.name("login"));
//	    buttonclick(login);
		//pom
		buttonclick(pom1.getLogin());
	}
	@Given("user enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String string, String string2) {
		pom1=new pom();
	    sendInput(pom1.getUsername(), string);
	    sendInput(pom1.getPassword(), string2);
	}

}
