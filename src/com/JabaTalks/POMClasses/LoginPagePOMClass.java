package com.JabaTalks.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPagePOMClass 
{
 private WebDriver driver;   
 private Select s;
 
    @FindBy(xpath="/html/body/div[1]/div[2]/section/div/div[2]/section/div/input[1]")
    private  WebElement LanguageSelect;
    public void ClickLanguageSelect()
    {
    LanguageSelect.click();
    s.selectByVisibleText("Dutch");
//    s.selectByIndex(1);
    }
    @FindBy(xpath="//input[@id='name']")
	private WebElement Fullname;
	@FindBy(xpath="//input[@id='orgName']")
	private WebElement OrgName;
	@FindBy(xpath="//input[@id='singUpEmail']")
	private WebElement Email;
	public void loginDetail()
	{
	Fullname.sendKeys("bhagyashri Hanumant Shep");
	OrgName.sendKeys("Wipro");
	Email.sendKeys("shepbhagyashri2595@gmail.com");
	Iagree.click();
	}
	
		
    @FindBy(xpath="//span[text()='I agree to the']")
	private  WebElement Iagree;
    public void clickIagreeButton()
	{
     Iagree.click();
     SignButton.click();
    }
    @FindBy(xpath="//button[text()='Get Started']")
	private  WebElement SignButton;
    public void clicksignButton()
	{
     SignButton.click();
    }
    @FindBy(xpath="//div[@id='shopping_cart_container']")
	  private WebElement SignButton1;
	  public String getTextFrombutton1()
	  {
	   String Button= SignButton1.getText();
	   return Button;
	  }
    
	public LoginPagePOMClass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}


}
