package HandlingDropdowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectMethods {

	public static void main(String[] args) {

		//Launch the browser
				WebDriver driver=new EdgeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Navigate to the url
				driver.get("https://www.amazon.in/");
				
				//Identify the dropdown
				WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
				
				//Create an instance of select class
				Select s=new Select(dropdown);
				
				//Select option based on the index
				 s.selectByIndex(7);
				
				//Select option based on the value
                  s.selectByValue("search-alias=apparel");
                  
                //Select option based on the visible text
                  s.selectByVisibleText("Luxury Beauty");
                  
                //Check whether the dd is single/multi select dd
                  System.out.println(s.isMultiple());
                  
                  //Fetch all the options
                 List<WebElement> list=s.getOptions();
                 
                 for(WebElement ele:list)
                 {
                	 System.out.println("Options : "+ele.getText());
				}
                 
                 //Fetch the first selected option
                 System.out.println("First selected option : "+s.getFirstSelectedOption().getText());
                 
                 //Fetch all the elements
                 List<WebElement> selected=s.getAllSelectedOptions();
                 for(WebElement ele: selected) { 
                	 System.out.println("All selected options : "+ele.getText());
                 
                 }
	}

}
