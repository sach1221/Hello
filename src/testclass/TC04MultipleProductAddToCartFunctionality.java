package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomclass.HomePagePOMClass;
import pomclass.LoginPagePOMClass;

public class TC04MultipleProductAddToCartFunctionality 
{
	@Test
	public void multiplefunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser open");
		
		//driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        LoginPagePOMClass lp = new LoginPagePOMClass(driver);
        
        lp.sendUsername();       //username
        System.out.println("Enter the username");
        
        lp.sendPassword();       //password
        System.out.println("Enter the password");
        
        lp.clickLoginButton();   //login click
        System.out.println("CLick on login button");
        
        //all product select.
        HomePagePOMClass hp = new HomePagePOMClass(driver);
        hp.addAllProduct();
        System.out.println("all products are added to cart");
		
        //validation
        System.out.println("apply the validation");
        
       String actualResult = hp.getTextFromCartButton();
       String expctedResult = "6";
       Assert.assertEquals(actualResult, expctedResult);
  
        driver.close();
        System.out.println("end of program");
        
        
        
        
        
        
	}


}
