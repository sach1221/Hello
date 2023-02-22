package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomclass.HomePagePOMClass;
import pomclass.LoginPagePOMClass;

public class TC02LogOutFunctionality 
{	
	@Test
	public void logoutfunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser open");
		
		//driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //login
        LoginPagePOMClass lp = new LoginPagePOMClass(driver);
        
        lp.sendUsername();       //username
        System.out.println("Enter the username");
        
        lp.sendPassword();       //password
        System.out.println("Enter the password");
        
        lp.clickLoginButton();   //login click
        System.out.println("CLick on login button");
        
        //homePage
        HomePagePOMClass hp = new HomePagePOMClass(driver);
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
//        
//        hp.clickLogOutButton();
//        System.out.println("Clicked on logout button");
        
        System.out.println("apply validation");
        
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        
        if(expectedUrl.equals(actualUrl))
        {
        	System.out.println("test case is passed");
        }
        else
        {
        	System.out.println("test case if failed");
        }
		
        driver.close();
        System.out.println("Browser is closed");
	}

}
