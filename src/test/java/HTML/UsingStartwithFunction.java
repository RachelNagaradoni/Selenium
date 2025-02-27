package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingStartwithFunction {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.facebook.com/");
		
		// Find UN TF and pass the text
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_email')]")).sendKeys("selenium");
		
		//Identify Pwd TF and pass the text
		driver.findElement(By.xpath("")).sendKeys("abc@123");
		
		//Identify Login button
		driver.findElement(By.xpath("//button[normalize-space(text()='Login')]")).click();
		
	    //Close the browser
	    //driver.quit();


	}

}
