package testbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Testbaseclass
{	
		WebDriver driver;
	@Parameters("browsername")
	@BeforeMethod
	public void setupmethod(String browsername)
	{
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

			driver =  new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
	 		
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Selenium2\\chromedriver_win32\\gecko.exe");

			driver =  new FirefoxDriver(); 
		
 		driver.get("https://www.saucedemo.com/");
		}
	}

	@AfterMethod
	public void teardowmmethod()
	{
		driver.close();
	}
	
}
