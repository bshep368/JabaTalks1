package com.JabaTalks.TestClasses;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.JabaTalks.POMClasses.LoginPagePOMClass;

import UtilityPackage.ScreenshotClass;


public class TC01LoginPageFunctionalityTestClass extends TestBaseClass
{
	
	@Test
	 
		public void LoginPagetest() throws IOException
		 {
		 LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		String expectedTitle = "Jabatalks";
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
		ScreenshotClass.Screenshot(driver);
}
	 {
		 LoginPagePOMClass lp=new LoginPagePOMClass(driver);	
		 String Actualresult=lp.getTextFrombutton1();
		 String Expresult=" A welcome email has been sent. Please check your email. ";	
		 System.out.println(Expresult);	
			try {
				ScreenshotClass.Screenshot(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}