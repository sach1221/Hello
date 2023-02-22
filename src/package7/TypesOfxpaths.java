package package7;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfxpaths 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();        
 		
 		driver.get("https://www.saucedemo.com/");
 		Thread.sleep(1000);
 		driver.manage().window().maximize();
 		
//	WebElement username =driver.findElement(By.xpath("//input[@id='user-name']"));
//			username.sendKeys("standard_user");
//			Thread.sleep(1000);
// 	
// 	WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
//		
// 	password.sendKeys("secret_sauce");
// 	Thread.sleep(1000);
// 	WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
//	
// 	login.click();
// 	
//// 	boolean k=login.isSelected();	
//// 	System.out.println(k);
// 	Thread.sleep(1000);
// 	WebElement addtocart =driver.findElement(By.xpath("	//button[text()='Add to cart']"));
// 	
// 	addtocart.click();
// 	Thread.sleep(1000);
// 	WebElement bucket =driver.findElement(By.xpath("	//a[@class='shopping_cart_link']	"));
// 	
// 	 bucket.click();
// 	Thread.sleep(1000);
// 	WebElement checkout =driver.findElement(By.xpath("	//button[@id='checkout']	"));
// 	
// 	checkout.click();
// 	Thread.sleep(1000);
// 	
// 	
//// 	WebElement cancle =driver.findElement(By.xpath("	 	//button[@id='cancel']	"));
//// 	
//// 	
//// 	cancle.click();
//// 	
////
//// 	
// 	
// 	WebElement fname =driver.findElement(By.xpath("		/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input	"));
// 	
// 	 fname.sendKeys("g");
// 	Thread.sleep(1000);
// 	WebElement middlename=driver.findElement(By.xpath("		/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input	"));
// 	
// 	middlename.sendKeys("f");
// 	Thread.sleep(1000);
// 	
// 	WebElement lastname =driver.findElement(By.xpath("	/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input	"));
// 	
// 	lastname.sendKeys("8");
// 
// 	Thread.sleep(1000);
// 	WebElement contiune =driver.findElement(By.xpath("	/html/body/div/div/div/div[2]/div/form/div[2]/input"));
// 	contiune.click();
// 	
// 	Thread.sleep(1000);
// 	WebElement finish =driver.findElement(By.xpath("		/html/body/div/div/div/div[2]/div/div[2]/div[8]/button[2]   "));
// 	
// 	finish.click();
// 
// 	
// 	
// 	
// 	
// 	
// 	
// 	
	}
}
