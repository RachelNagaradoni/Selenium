package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
	
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the url
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclickbtn= driver.findElement(By.xpath("//span[text()='right click me']"));
		  
		Actions act = new Actions(driver);
		act.contextClick(rightclickbtn).perform();
		
		act.click(rightclickbtn).perform();
		
		WebElement doubleclickbtn= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		  
		act.doubleClick(doubleclickbtn).perform();

		
		//Close the browser
		//driver.quit();


	}

}
