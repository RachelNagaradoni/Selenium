package HandlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingMultiSelector {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new EdgeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the url
		driver.get("https://demoapp.skillrary.com/");
		
		//Identify the dropdown
		WebElement multisdd=driver.findElement(By.id("cars"));
		Select s=new Select (multisdd);
		
		//Select option based on the index
		 s.selectByIndex(1);
		
		//Select option based on the value
         s.selectByValue("90");
         
       //Select option based on the visible text
         s.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");

        //Deselect option based on index
         s.deselectByValue("90");
	}

}
