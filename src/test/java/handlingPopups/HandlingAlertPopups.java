package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopups {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
			
		// Maximize the window
		driver.manage().window().maximize();
			
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
       // Navigate to application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Click on Alert popup button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Switch the driver control to the alert popup
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		//Click on Alert popup button
     	//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
				
         
		//driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//Close the browser
		//driver.quit();

	}

}
