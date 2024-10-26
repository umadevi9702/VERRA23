package TechInterview;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);		
		
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
		
		driver.findElement(By.xpath("//input[@id='search_sel_id']")).sendKeys("999999");
		Thread.sleep(5000);	
		System.out.println("Text entered");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Searchbutton got clicked");
	    
		
		//String text=driver.findElement(By.xpath("//td[7]")).getText();	
		//(text.equals("Registered"))


		String act_value="";
		try
		{
			
			act_value=driver.findElement(By.xpath("//td[7]")).getText();
			
		}
		catch (NoSuchElementException e) 
		{
			
		}
		
		String exp_value="Registered";
		
		if(act_value.equals(exp_value))
		{
			
			System.out.println("Test Pass");
		}
		
		else {
			 
			   System.out.println("Test Fail");
		}

		
		
		
		
		}
		
	
	}
	


		
		
		
	