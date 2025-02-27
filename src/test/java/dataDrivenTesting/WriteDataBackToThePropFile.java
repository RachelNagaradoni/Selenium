package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataBackToThePropFile {

	public static void main(String[] args) throws IOException {
		
		// Converting Physical File to a java obj
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		 
		//Create an empty property file
		Properties p = new Properties();
		
		// Load the prop obj
		p.load(fis);
		
		//Writing data back to prop obj
		p.put("animal", "cat");
		
		//Save prop file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commonData.properties");
		p.store(fos, "Updated Succesfully");

	}

}
