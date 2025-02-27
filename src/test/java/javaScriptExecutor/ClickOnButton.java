package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {

	public static void main(String[] args) {
	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the url
		driver.get("https://www.facebook.com/");
		
		//Find the element
		WebElement login = driver.findElement(By.name("login"));
		
		// Click on enabled login button using jse
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", login);
		
		// To Click on disabled login button
		//js.executeScript("arguments[0].checked=true", login);
		
		//Close the browser
		//driver.quit();


	}

}
