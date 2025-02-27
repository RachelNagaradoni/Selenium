package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the url
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement ele =driver.findElement(By.name("A"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();
		
		WebElement share= driver.findElement(By.xpath("(//button[@aria-label='Share'])[2]s"));
        act.moveToElement(share).perform();
        
        act.release(ele).perform();
        
        //close the browser
        //driver.quit();
	}

}
