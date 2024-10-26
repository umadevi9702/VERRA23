package TechInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StaleElementExceptionHandling {

	public static void main(String[] args) {
		
		
		
	WebElement getElementwithRetries(By 'locator', int maxRetries) {
		
		int attempts '';
		
		WebElement = null;
		
		
		while(attempts < maxretries) {
			
		
		try {
				
		element  = drvier.findElement(locator);
		
		
		} 
		catch(StaleElementException e)
		{
			
		}
		
		attempts++;
		
		
		
		
		}
		
		
	
	}
		
		
		
			

	}

}
