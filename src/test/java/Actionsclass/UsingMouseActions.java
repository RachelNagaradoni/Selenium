package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseActions {

	public static void main(String[] args) {
		
		//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Navigate to the url
				driver.get("https://www.flipkart.com/");
				
				//Identify search TF
				//driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
				
				//Scroll webpage based on coordinates
				Actions act=new Actions(driver);
				act.scrollByAmount(100,500).perform();
				
				//Scroll webpage based on web element
				WebElement ele=driver.findElement(By.xpath("//a[text()='Cleartrip']"));
				act.scrollToElement(ele).moveToElement(ele).click().build().perform();
              
				//close the browser
				driver.quit();
	}

}
