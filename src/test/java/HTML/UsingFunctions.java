package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFunctions {

	public static void main(String[] args) {
		
		   //Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Navigate to the url
				driver.get("https://www.flipkart.com/");
				
				// Find search TF and search anything
				driver.findElement(By.name("q")).sendKeys("toys");
				
				//Click on search button
				driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();

				   //Close the browser
			    //driver.quit();

	}

}
