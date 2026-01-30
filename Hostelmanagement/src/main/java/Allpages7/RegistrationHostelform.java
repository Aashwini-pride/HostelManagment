package Allpages7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import genericmethod7.genericmethod7;

public class RegistrationHostelform extends genericmethod7 {
	
	  public static WebDriver driver;
	
	
	public static By LocalGuardianName = By.name("LocalGuardianName");
	public static By GaurdianContactNo = By.name("LocalGuardiantNo");
	public static By LocalGuardianAlternateNo = By.name("LocalGuardianAlternateNo");
	public static By uploadmedicalfile = By.xpath("//input[@type = 'file']");
	public static By Checkboxdecleration = By.xpath("//input[@type = 'checkbox']");
	public static By CheckboxUnd = By.name("chkUndertaking");
	public static By Savebutton = By.id("btnSave");
	

	public static  void Enter_LocalGuardinnName(String GuardianName)
	{
		driver.findElement(LocalGuardianName).sendKeys(GuardianName);
	}
	
	public static  void Enter_GaurdianContactNo(String Gaurdiancontactnumber)
	{
		driver.findElement(GaurdianContactNo).sendKeys(Gaurdiancontactnumber);
	}
	
	public static  void Enter_LocalGuardianAlternateNo(String Alternateno)
	{
		driver.findElement(LocalGuardianAlternateNo).sendKeys(Alternateno);
	}
	public static void click_Checkboxdecleration()
	{
		driver.findElement(Checkboxdecleration).click();
	}
	
	public static void click_CheckboxUnd()
	{
		driver.findElement(CheckboxUnd).click();
	}
	
   //public static void Click_saveButton()
	//{
	//WebElement button = driver.findElement(Savebutton);
	//genericmethod7.click_javascriptexecutor(button);
	//}
	
	
}
