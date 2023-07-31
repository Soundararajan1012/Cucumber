package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethod {
	public static WebDriver driver;
	public static  WebDriver getdriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(obj);
		return driver;
	}
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	public static void sendInput(WebElement element,String input)
	{
		element.sendKeys(input);
	}
	public static void buttonclick(WebElement element)
	{
		element.click();
	}
	public static void implicitwait(int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

}
