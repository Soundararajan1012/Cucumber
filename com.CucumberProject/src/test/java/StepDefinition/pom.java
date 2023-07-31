package StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom extends ReusableMethod {
	public pom()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	public WebElement username;
	@FindBy(id="pass")
	public WebElement password;
	@FindBy(name="login")
	public WebElement login;
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
}
