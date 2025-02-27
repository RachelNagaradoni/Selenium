package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotMethods {

	public static void main(String[] args) throws IOException  {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
				
	   //Maximize the browser
	    driver.manage().window().maximize();
				
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// Navigate to the url
			driver.get("https://www.swiggy.com/");
		
		//Take screenshot of a webpage
        //Step 1: Typecast take screenshot (i) with driver ref.variable
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//Step 2: Take the screenshot and store in temp file
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Create an empty file
		File dest= new File("./Screenshot/swiggy.png");
		
		//Step 4: Copy the screenshot in an empty file
	     FileUtils.copyFile(src,dest);
	
		
		//close the browser
		//driver.quit();
	}

}
