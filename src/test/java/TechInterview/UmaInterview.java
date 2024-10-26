package TechInterview;

//import java.awt.Window;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UmaInterview {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://registry.verra.org/");
		driver.manage().window().maximize();
		System.out.println("URL opened");
		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		System.out.println("PUBLIC REPORT got clicked");
		
		driver.findElement(By.xpath("//a[@href='/app/search/VCS']//span")).click();
		System.out.println("VERIFIED CARBON STANDARD got clicked");
		
		driver.findElement(By.xpath("//input[@id='search_sel_id']")).sendKeys("1050");
		Thread.sleep(5000);	
		System.out.println("Text entered");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Searchbutton got clicked");
	    
		
		String text=driver.findElement(By.xpath("//td[7]")).getText();		
		
		
		try {
		
		
		
		if(text.equals("Registered"))
		
		{
			System.out.println("Test is pass");					
	
		}		
		else 
		{
			System.out.println("Test is failed");
		}
		
		
		}
		
		catch(NoSuchElementException e){
			
			e.printStackTrace();
			//e.printStackTrace();
			
			}
	
					
	
		

	}

}


/*driver.findElement(By.xpath("//td[7]"));
System.out.println("Registered is focused");*/
