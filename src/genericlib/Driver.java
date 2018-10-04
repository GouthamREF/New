package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver 
{
	
	 public static WebDriver dr;
		public static Object browser = null;
		
		public static WebDriver getbrowser()
		{
			if(Constants.browser.equals("firefox"))
			{
				dr=new FirefoxDriver();
			}
			else if(Constants.browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\me\\Downloads\\chromedriver_win32\\chromedriver.exe");
				dr=new ChromeDriver();
			}
			return dr;
		}


}
