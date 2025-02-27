package handlingPopups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserOrMultipleWindowsPopup {

	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles" + Keys.ENTER);
		
		//Fetch the parent Window Id
		String pwid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();

       //Fetching all the child window ids
		Set<String> wids = driver.getWindowHandles();
		
		//Iterating all the window ids
		for(String s : wids) {
			
	    //Switch the driver control
			driver.switchTo().window(s);
			
			if (driver.getTitle().contains("MOTOROLA g05 (64 GB Storage, 4GB RAM)")) {
				 driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
			}
		
		
		}
		//Switching back to the parent window
		driver.switchTo().window(pwid);
			}

}
