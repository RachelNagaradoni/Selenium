package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

	public static void main(String[] args) {
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[title= 'Search for Products, Brands and More']")).sendKeys("mobiles");
 
		//driver.findElement(By.cssSelector(""));
	}

}
