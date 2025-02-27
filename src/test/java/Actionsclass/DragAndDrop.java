package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the url
		driver.get("https://testkru.com/Interactions/DragAndDrop");
		
		WebElement drag=driver.findElement(By.id("box1"));
		WebElement drop=driver.findElement(By.id("dropZone1"));
		
		WebElement drag1=driver.findElement(By.id("box3"));
		WebElement targetloc=driver.findElement(By.id("dropZone3"));
		
		WebElement drag2=driver.findElement(By.id("box2"));
		WebElement drop2=driver.findElement(By.id("dropZone2"));
		
		Actions act=new Actions(driver);
				
		act.dragAndDrop(drag, drop).perform();
		act.scrollToElement(targetloc).perform();
		act.dragAndDrop(drag1, targetloc).perform();
				
		if (drop2.isEnabled()) {
			
			act.dragAndDrop(drag2, drop2).perform();
				
		}
		else
		{
		System.out.println("drag2 is not enabled");
		}
		//close the browser
		//driver.quit();
	}
}
