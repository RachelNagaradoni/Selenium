package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActions {
	
public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		// Navigate to the url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify the search TF
		WebElement searchTF= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 searchTF.sendKeys("books");
		 
		 //Clear the text
		 searchTF.clear();
		 
		 searchTF.sendKeys("computers");
		 
		 //Identify search button
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//click on register link
		driver.findElement(By.linkText("Register")).click();

		 //Close the browser
	     //driver.quit();

	}



}
