package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopupUsing_Robot {

	public static void main(String[] args) throws AWTException {
     
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the app 
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement upload = driver.findElement(By.id("file-upload"));
		Actions act= new Actions(driver);
       
		act.moveToElement(upload).click().build().perform();
		
		StringSelection str= new StringSelection("C:\\Users\\Dell\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Robot r= new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);

		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 driver.findElement(By.id("file-submit")).click();
	}

}
