package Automation.Flipkart;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basics {

	
		public WebDriver driver;
		public DataUtility p=new DataUtility();
		public Utilities u=new Utilities();
		@BeforeClass
		public void LunchBrowser()
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		@BeforeMethod
		public void LogIn() throws IOException
		{
			driver.get(p.getDatafromProperties("url"));
		}
		@AfterClass
		public void Logout()
		{
			driver.quit();
		}


	}


