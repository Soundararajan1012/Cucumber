package ReusableMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableFacebook {
	public static WebDriver driver;
	public static  WebDriver getdriver()
	{
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

}
