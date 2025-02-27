package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {

	public static void main(String[] args) {
	
	       //Launch the browser
			WebDriver driver=new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Navigate to the url
			driver.get("https://www.facebook.com/");
			
			//Identify UN TF
			WebElement user=driver.findElement(By.name("email"));
			user.sendKeys("Selenium");
			
			//Identify Pwd TF
			WebElement pwd=driver.findElement(By.name("pass"));
			pwd.sendKeys("abc@123");
			
			//Identify Login button
			WebElement login=driver.findElement(By.name("login"));
			login.click();

			//close the browser
			//driver.quit();
			

	}

}
