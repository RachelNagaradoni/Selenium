package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingOperators {

	public static void main(String[] args) {
		
		   //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.facebook.com/");
		
		//Identify UN TF
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("Selenium");
		
		//driver.findElement(By.xpath("//input[@type='text' or @name='email']")).sendKeys("Selenium");
		

		
		//Identify Pwd TF
		driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("abc@123");
		
		//driver.findElement(By.xpath("//input[@type='password' or @name='pass']")).sendKeys("abc@123");

		
		//Identify Login button
		driver.findElement(By.xpath("//button[@type='submit' and @name='login']")).click();

		//driver.findElement(By.xpath("//button[@type='submit' or @name='login']")).click();

      

	}

}
