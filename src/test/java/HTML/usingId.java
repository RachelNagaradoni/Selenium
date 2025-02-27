package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingId {

	public static void main(String[] args) throws InterruptedException {
		
		 //Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to the url
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
				
     	//Identify the username TF and pass the text
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");

     	//Identify the pswd TF and pass the text
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd@123");
			
		 //Identify the Login button and click
           driver.findElement(By.xpath("//button[text()='Log in']")).click();
           Thread.sleep(3000);
			    
		       //Navigate to previous page
				driver.navigate().back();
	
			    //Verify the main page
				String title2=driver.getTitle();
				
				if(title.equals(title2)) {
					driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
				}
			    //Close the browser
			    //driver.quit();


	}

}
