package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the appln
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//File upload using sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Dell\\Desktop");
	
		// Close the browser
		driver.quit();
	}

}
