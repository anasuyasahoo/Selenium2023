package Automation.Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.Flipkart.Basics;

public class FlipTest extends Basics {
	@Test
	public void Flipcart() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement txtbox= driver.findElement(By.name("q"));
		txtbox.sendKeys("Iphone",Keys.ENTER);
		
		Thread.sleep(2000);
		List<WebElement> allproduct=driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div[1]/div[1]/div[1]"));
	     for(WebElement product:allproduct)
	     {
	    	 String name=product.getText();
	    	 String price=driver.findElement(By.xpath("//div[text()='"+name+"']/../../div[2]/div[1]/div[1]/div[1]")).getText();
	    	 {
	    	   System.out.println(name+"---------------->"+price);
	    	 
	    	 }
	
	     }
}       
}				
		

