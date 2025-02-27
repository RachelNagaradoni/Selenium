package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingLinkText {

	public static void main(String[] args) {
		
		     //Launch the browser
			WebDriver driver=new EdgeDriver();
				
			//Maximize the browser
			driver.manage().window().maximize();
				
			//Navigate to the url
			driver.get("https://www.amazon.in//");
				
		     // Find element by text
			//driver.findElement(By.linkText("MX Player")).click();
		     driver.findElement(By.partialLinkText("MX")).click();
 
			   //close the browser
			  //driver.quit(); 

	}

}
