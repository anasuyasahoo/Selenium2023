package Automation.Flipkart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Utilities {
	public void implicitwait(WebDriver driver,int Second)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
