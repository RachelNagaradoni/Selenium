package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnApplication {

	public static void main(String[] args) {
		
		//Launch the browser
			WebDriver driver = new ChromeDriver();
				
			// Maximize the window
			driver.manage().window().maximize();
				
			//Implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			//Navigate to the application using jse
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.location=arguments[0]","https://www.facebook.com/");
				
			//Fetch the title of the webpage
			System.out.println("Title : " + js.executeScript("return document.title"));
			
			//Fetch the url of the webpage
			System.out.println("Url : "+js.executeScript("return document.URL"));
			
			//Refresh the Webpage
			js.executeScript("history.go(0)");
			
          //Close the browser
		  //driver.quit();
	}

}
