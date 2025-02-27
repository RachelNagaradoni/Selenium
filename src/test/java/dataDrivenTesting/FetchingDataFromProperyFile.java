package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromProperyFile {

	public static void main(String[] args) throws IOException  {
		 
		//Step 1: Convert the physical prop file into java obj
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		
		//Step 2: Create an object of properties
		Properties p= new Properties();
		
		//Step 3: Load the prop obj from obj
		p.load(fis);
		
		//Step 4: Fetch the data from prop object
		String data = p.getProperty("browser");
				
		System.out.println(data);
			}

}
