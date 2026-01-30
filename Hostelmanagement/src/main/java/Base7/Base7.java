package Base7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base7 {
	
	public static String Browser = "chrome";
	public static String URL = "URL";
	public static WebDriver driver;
	
	public static void BrowserInitilization(String Browser , String URL)
	{
		switch(Browser)
		{
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://login.sspu.ac.in/");
			break;
			
		case"IE":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		}
	public static void close_browser()
	{
		driver.close();
	}

}
