package Allpages7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base7.Base7;
import genericmethod7.genericmethod7;

public class Loginpage extends genericmethod7 {
	
	public static By inputuser = By.name("txtUserName");
	public static By password1 = By.id("txtPassword");
	public static By LoginButton = By.xpath("//input[@type = 'submit']");
	
	public  void Enter_username(String username, By inputuser)
	{
	
		driver.findElement(inputuser).sendKeys(username);
	}
	
	public  void Enter_pass(String password, By password1)
	{
		driver.findElement(password1).sendKeys(password);
		
	}
	
	public static  void click_login()
	{

	WebElement ele = driver.findElement(LoginButton);
	genericmethod7.click_javascriptexecutor(ele);
	
    }
	
}
