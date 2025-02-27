package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.amazon.in//");

		//Identify all the links in the webpage
	   List<WebElement>links=driver.findElements(By.tagName("a"));
	
	    for (WebElement ele:links) {
		 
		System.out.println(ele.getText());
	  }
		
	    //close the browser
		  //driver.quit(); 

	}

}
