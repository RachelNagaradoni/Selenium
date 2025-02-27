package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidations {

	public static void main(String[] args) {
	
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		// Navigate to the url
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchTF=driver.findElement(By.id("small-searchterms"));
		
		//Verify if searchTf is displayed
		if (searchTF.isDisplayed()) {
			
			searchTF.sendKeys("books");
		}
		
		//Verify if Search button is enabled
		   WebElement searchBtn=driver.findElement(By.xpath("//input[@type='submit']")); 
			
		   if(searchBtn.isEnabled()) {
				searchBtn.submit();
		}
			//Verify if checkbox is selected
			WebElement checkbox=driver.findElement(By.id("As"));
			checkbox.click();
			
			if (checkbox.isSelected()) {
				System.out.println("Checkbox Selected");
			}
				else {
					System.out.println("Checkbox not selected");
				}
				
			}
		
		 //Close the browser
        //driver.quit();
	}


