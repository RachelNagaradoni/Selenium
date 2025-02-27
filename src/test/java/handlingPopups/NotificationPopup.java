package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
	
		//Launch the browser
		WebDriver driver = new ChromeDriver(opt);
			
		// Maximize the window
		driver.manage().window().maximize();
			
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
       // Navigate to application
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		driver.findElement(By.id("browserNotButton")).click();


	}

}
