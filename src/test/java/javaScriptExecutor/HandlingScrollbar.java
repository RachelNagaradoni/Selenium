package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbar {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
				
	   //Maximize the browser
	    driver.manage().window().maximize();
				
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// Navigate to the url
		driver.get("https://www.ajio.com/");
		
		//Scroll the webpage using hardcoded coordinates
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,1700)");
		
		//Scroll the webpage using element reference
		WebElement ele= driver.findElement(By.xpath("//strong[text()='ASSURED QUALITY']"));
		//js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		//Scroll webpage using element coordinates
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		js.executeScript("window.scrollBy("+ x +","+ y +")");
		System.out.println(x + "," + y);
		
		// Scroll till bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scroll till top of the page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//close the browser
		//driver.quit();

	}

}
