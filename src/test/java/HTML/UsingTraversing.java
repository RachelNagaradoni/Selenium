package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTraversing {

	public static void main(String[] args) {
		
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.flipkart.com/");
				
    	//Identify the Search TF and pass the text
		 driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		 
		 WebElement dynamicvalue=driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F05 (Twilight Blue')]/../div/span/div[@class='XQDdHH']"));
        
		 System.out.println(dynamicvalue.getText());

	}

}
