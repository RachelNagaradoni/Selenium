package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {
	//Changes done in GitHub
	@Test

	public void softAssert() {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		 String title = driver.getTitle();
		 
		 //SoftAssert
		 SoftAssert soft = new SoftAssert();
          
		 soft.assertEquals(title,"Facebook – log in or sign up");
		
		 //Assert False
		 boolean condition = driver.getTitle().contains("Facebook – log in or sign up");
		 
		 Assert.assertFalse(condition);
		 
		 System.out.println("Verification passed");
		  
		  driver.quit();
         soft.assertAll();        
	}

}
