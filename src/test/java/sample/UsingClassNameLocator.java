package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameLocator {
	public static void main(String[] args) {
		
	       //Launch the browser
			WebDriver driver=new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Navigate to the url
			driver.get("https://www.facebook.com/");
			
			//Identify UN TF
			driver.findElement(By.className("inputtext")).sendKeys("Selenium");
			
			//Identify Pwd TF
			driver.findElement(By.className("_9npi")).sendKeys("abc@123");
			
			//Identify Login button
			driver.findElement(By.className("_42ft")).click();
			
			//close the browser
			//driver.quit();

	}
}
