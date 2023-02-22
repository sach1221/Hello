package package7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handledropdownorlistbox
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();        
 		
 		driver.get("https://www.saucedemo.com/");
 		Thread.sleep(1000);
		
 		WebElement username =driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
 	
		username.sendKeys("standard_user ");
		
		Thread.sleep(1000);
	 	WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
			
	 	password.sendKeys("secret_sauce");
	 	
	 	
	 	Thread.sleep(1000);
	 	
	 	WebElement login =driver.findElement(By.xpath("  /html/body/div/div/div[2]/div[1]/div[1]/div/form/input   "));
		
	 	login.click();
	 	
	 	
	}

}
