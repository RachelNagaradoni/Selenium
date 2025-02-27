package Assertions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingHardAssert {

	
	public void HardAssert() {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();

		//Hard Assert
		
		 
		
		System.out.println("Verification Passed");
		
		//driver.quit();
	}

}
