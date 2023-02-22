package package7;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();        
 		
 		driver.get("https://www.saucedemo.com/");//this method is use to open url
 		
 		//both method is use to open url
 		
// 		driver.navigate().to("https://www.facebook.com/");
// 		Thread.sleep(1000);
// 		driver.navigate().back();
// 		
// 		Thread.sleep(1000);
// 		
// 		driver.navigate().forward();
// 		
//
// 		Thread.sleep(1000);
// 		
// 		driver.navigate().refresh();
// 		

 		Thread.sleep(1000);
 		driver.manage().window().maximize();
 		
 		//driver.manage().window().minimize();
 		Thread.sleep(1000);
 		//driver.close();
 		//driver.quit();
 		//String s=driver.getCurrentUrl();
 		//System.out.println(s);
		
 		//String s=driver.getTitle();
 		//System.out.println(s);
 		
// 		Dimension d= new Dimension(300,500);// import from selenium
// 		
// 		driver.manage().window().setSize(d);
// 		
// 		Point p= new Point(300,500);
// 		
// 		driver.manage().window().setPosition(p);
// 		
// 		String exceptedurl= "https://www.facebook.com/";
// 		String actualurl=driver.getCurrentUrl();
// 		
// 		if(exceptedurl.equalsIgnoreCase(actualurl))
// 		{
// 			System.out.println("tc is passed");
// 		}
// 		else
// 		{
// 			System.out.println("tc is fail");
// 		}
 		
 		
 		
	}

}
