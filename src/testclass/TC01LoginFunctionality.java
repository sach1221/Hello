package testclass;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomclass.LoginPagePOMClass;

public class TC01LoginFunctionality
{	
	@Test
	public void loginfunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();        
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
        
       String expectedTitle = "Swag Labs";
       String actualTitle = driver.getTitle();
       
       System.out.println("Verify the test case");
        
       if(expectedTitle.equals(actualTitle))
       {
    	   System.out.println("Test case is passed");
       }
       else
       {
    	   System.out.println("Test case is failed");
       }
      // ScreenshotClass.takeScreenshot(driver);
        
        //logout
       driver.close();
       System.out.println("End of program");
        
		
	}

}
