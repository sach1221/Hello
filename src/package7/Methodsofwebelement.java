package package7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methodsofwebelement
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();        
 		
 		driver.get(" https://vctcpune.com/selenium/practice.html  ");
 		Thread.sleep(1000);
 		//driver.manage().window().maximize();
 		
// 		WebElement username =driver.findElement(By.xpath("//input[@id='user-name']"));
//		String s= username.getAttribute("id");
//			System.out.println(s); 		
// 			String b=	username.getTagName();
//	
//		System.out.println(b);
//		String n=username.getText();
//		System.out.println(n);
// 		
// 		
//	boolean h =username.isDisplayed();
// 		System.out.println(h);
// 		
// 		boolean j=username.isEnabled();
// 		
// 		System.out.println(j);
 		
 		
	
	
	
	
	
	
	
	
	}

}
