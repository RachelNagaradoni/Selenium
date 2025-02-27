package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToZomato {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
			
		// Maximize the window
		driver.manage().window().maximize();
			
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
       // Navigate to application
		driver.get("https://www.zomato.com/");
		
		//Click on login link
		driver.findElement(By.linkText("Log in")).click();
		
		//Switch the driver control to the frame
		driver.switchTo().frame("auth-login-ui");
		
		//Enter the mobile no
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9762462523");
		
		// Close the login Frame
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		//Switch the driver control to the main webpage
		driver.switchTo().defaultContent();
		
		//Pass the text in search TF
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search ')]")).sendKeys("ice cream");
		
		//Close the browser
		//driver.quit();
	}

}
