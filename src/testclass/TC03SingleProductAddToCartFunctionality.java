package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomclass.HomePagePOMClass;
import pomclass.LoginPagePOMClass;

public class TC03SingleProductAddToCartFunctionality
{
	@Test
	public void singleproductaddtocartfunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser open");
		
		//driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        LoginPagePOMClass lp = new LoginPagePOMClass(driver);
        
        lp.sendUsername();       //username
        System.out.println("Enter the username");
        
        lp.sendPassword();       //password
        System.out.println("Enter the password");
        
        lp.clickLoginButton();   //login click
        System.out.println("CLick on login button");
        
        HomePagePOMClass hp = new HomePagePOMClass(driver);
        
        //single product
        hp.clickBagButton();
        System.out.println("product is added to cart");
		
        System.out.println("Apply the validation");
        
        String actualResult = hp.getTextFromCartButton();
        
        String expectedResult ="1";
        
        if(expectedResult.equals(actualResult))
        {
        	System.out.println("Test case is passed");
        }
        else
        {
        	System.out.println("Test case is failed");
        }
        
        driver.close();
        System.out.println("End of program");
        
        
	}


}
