package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends ReusableMethod{
	@Before
	public  void Title() {
		getdriver();
		loadurl("https://www.facebook.com");	
	}
	
	
	@After
	public  void Checked() throws IOException {
		String s1="Facebook – log in or sign up";
		String s2=driver.getTitle();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Successfully");
			driver.quit();
		}
		else
		{
			System.out.println("Failed");
			TakesScreenshot ts=(TakesScreenshot) driver;
			String s=new SimpleDateFormat("DD-MM-YYYY HH-mm-ss").format(new Date());
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("D:\\eclipse\\com.CucumberProject\\Screenshot\\Facebook.png"+s+".png");
			FileUtils.copyFile(source, destination);
			driver.quit();
		}
		

	}
	

}
