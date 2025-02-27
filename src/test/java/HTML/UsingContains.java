package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingContains {

	public static void main(String[] args) {
		
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.facebook.com/");
				
     	//Identify the username TF and pass the text
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("selenium");

     	//Identify the pswd TF and pass the text
		 driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("abcd@123");
			
		 //Identify the Login button and click
           driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
           
           //Close the browser
		    //driver.quit(); 
	}

}
