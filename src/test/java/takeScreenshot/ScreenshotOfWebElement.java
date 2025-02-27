package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		
	    	//Launch the browser
				WebDriver driver=new ChromeDriver();
						
			   //Maximize the browser
			    driver.manage().window().maximize();
						
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				// Navigate to the url
				driver.get("https://www.swiggy.com/");
				
				//Find the webelement
				WebElement icon= driver.findElement(By.xpath("//img[@loading='lazy']"));
				
				//Screenshot of webelement
				File temp = icon.getScreenshotAs(OutputType.FILE);
				File newfile=new File("./Screenshot/element.png");
				FileUtils.copyFile(temp, newfile);
				

	}

}
