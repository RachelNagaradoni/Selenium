package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenPopup {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
			
		// Maximize the window
		driver.manage().window().maximize();
			
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
       // Navigate to application
		driver.get("https://www.makemytrip.com/");
		
		//Click on close icon
		driver.findElement(By.xpath("//span[contains(@class,'commonModal__close')]")).click();
		
		//Click on From TF
		driver.findElement(By.id("fromCity")).click();
		
		//Find the From TF and enter the From city
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum");
      
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
		
		//Click on To TF
		driver.findElement(By.id("toCity")).click();
		
		//Find the To TF and enter the To city
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("New");
		
		driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'February')]/../../descendant::p[text()='16']")).click();
	}

}
