package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetters {

	public static void main(String[] args) {
		//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				// Navigate to the url
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement register=driver.findElement(By.linkText("Register"));
				 
				//Find the text on element
                 System.out.println(register.getText());
                 
                 //Fetch the Attribute value
                 System.out.println(register.getAttribute("class"));
                 
                 //Fetch the tag name
                 System.out.println(register.getTagName());
                 
                 //Fetch the size
                 System.out.println(register.getSize());
                 
                 //Fetch the Location
                 System.out.println(register.getLocation());
                 
                 //Fetch the Rect
                 System.out.println(register.getRect().getX());
                 
                 //Fetch the css Value
                 System.out.println(register.getCssValue("color"));     
            
                 //Close the browser
                 //driver.quit();
                 
	}

}
