package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGroupIndexing {

	public static void main(String[] args) {
	
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://demoapp.skillrary.com/");
				
     	//Identify the Search TF and pass the text
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles"+Keys.ENTER);

		 //Close the browser
	      //driver.quit();

	}

}
