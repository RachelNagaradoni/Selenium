package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingpromptPopups {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    
	  //Click on Prompt popup button
	     driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	   
	   //Switch the driver control to the alert popup 
	     Alert al= driver.switchTo().alert();
	   
	     //Entering input into the popup TF
	    al.sendKeys("selenium");
	    al.accept();
	     
	     WebElement result= driver.findElement(By.id("result"));
	     System.out.println(result.getText());
	     
	     driver.quit();

	}

}
