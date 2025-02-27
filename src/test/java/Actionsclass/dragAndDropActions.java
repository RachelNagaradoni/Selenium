package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropActions {

	public static void main(String[] args) {
		

		//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Navigate to the url
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				WebElement drag=driver.findElement(By.id("box6"));
				WebElement drop=driver.findElement(By.id("box106"));
				
				WebElement drag1=driver.findElement(By.id("box5"));
				WebElement targetloc=driver.findElement(By.id("box105"));
				
				WebElement drag2=driver.findElement(By.id("box1"));
				WebElement drop2=driver.findElement(By.id("box101"));

				Actions act=new Actions(driver);
						
				act.dragAndDrop(drag, drop).perform();
				act.dragAndDrop(drag1, targetloc).perform();
				act.dragAndDrop(drag2, drop2).perform();
				//close the browser
				//driver.quit();

	}

}
