package package7;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locationandsizeofelementmethods
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();        
 		
 		driver.get("https://www.saucedemo.com/");
 		Thread.sleep(1000);
		
 		
 		WebElement username =driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
 	Dimension  p=	username.getSize();
 		System.out.println(p);
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

}
