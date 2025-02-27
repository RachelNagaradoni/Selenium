package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Utility.Listeners.class)

public class ListenersScenario {
	
		@Test
		
		public void demo()
		{
			System.out.println("Test Execution");
		}
}
