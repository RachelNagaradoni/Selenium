package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the url
		driver.get("https://www.myntra.com/");

		//Identify the element
		WebElement beauty= driver.findElement(By.xpath("//a[text()='Beauty']"));
		
		//Mouse hover to the element
		Actions act = new Actions(driver);
		act.moveToElement(beauty).perform();
		
		//Close the browser
		//driver.quit();
	}

}
