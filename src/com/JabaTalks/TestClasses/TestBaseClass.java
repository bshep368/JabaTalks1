package com.JabaTalks.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.JabaTalks.POMClasses.LoginPagePOMClass;

import UtilityPackage.ScreenshotClass;



public class TestBaseClass 
{
	WebDriver driver;
	@BeforeMethod

	public void setUP() throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Selenium1\\chromedriver.exe");	
      	driver=new ChromeDriver();
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		System.out.println("URL is opned");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit wait
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);	
		lp.ClickLanguageSelect();
		System.out.println("Language is selected");
		lp.loginDetail();
		System.out.println("Login Details are entered");
		lp.clickIagreeButton();
		System.out.println("Clicked on I agree button");
		lp.clicksignButton();
	    System.out.println("Clicked on Sign Button nd Welcome mail is sent");
	    ScreenshotClass.Screenshot(driver);
		
	}
//	@AfterMethod
//	 public void tearDown()
//	{
//		
//	    driver.quit();
//	    System.out.println("End of program");
//}
}