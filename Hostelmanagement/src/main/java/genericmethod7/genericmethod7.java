package genericmethod7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base7.Base7;

public class genericmethod7 extends Base7 {
	
	public static void click_javascriptexecutor(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
	}
	
	public static void double_click(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
	}
	
	
}
	

