package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrameByIndex {

	public static void main(String[] args) {
		

		//Launch the browser
		WebDriver driver = new ChromeDriver();
			
		// Maximize the window
		driver.manage().window().maximize();
			
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
       // Navigate to application
		driver.get("https://www.snapdeal.com/");
		
		//Identify the signin element
		WebElement signin= driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		//Mousehover to the element
		Actions act=new Actions(driver);
		act.moveToElement(signin).perform();
		
		//Click on Login button
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		//Switch the driver control to the frame by index
		driver.switchTo().frame(0);
		
		//Switch to frame using frame element
		WebElement Ele= driver.findElement(By.xpath("loginIframe"));
		
		//Enter the mobile no
		driver.findElement(By.id("userName")).sendKeys("2313314449");
		
		//Close the signin frame
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-delete-sign fnt-22')]")).click();
		
		//Switch the driver control to the main webpage
		driver.switchTo().defaultContent();
		
		//Pass the text in search TF
	   driver.findElement(By.name("keyword")).sendKeys("toys" + Keys.ENTER);
	   
	   //Close the browser
	   //driver.quit();

	

	}

}
