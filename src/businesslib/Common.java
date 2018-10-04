package businesslib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlib.Constants;
import genericlib.Driver;
import pagefactory.Login;
import pagefactory.Logout;

public class Common 
{
	public static void login() throws InterruptedException
	{
		Driver.dr=Driver.getbrowser();
		Driver.dr.get(genericlib.Constants.url);
	    Driver.dr.manage().window().maximize();
		Thread.sleep(2000);
		Driver.dr.findElement(Login.un).sendKeys(Constants.userid);
		Driver.dr.findElement(Login.pwd).sendKeys(Constants.password);
		Driver.dr.findElement(Login.lgnbtn).click();
		Thread.sleep(2000);
	}
	
	 
	/*public static void logout() throws InterruptedException
	{
		
		//ActionsMethods.movetoelement(Common_CPF.logout);

		//Driver.dr.findElement(Logout.log).click();
		//Thread.sleep(2000);
		Driver.dr.findElement(Logout.logout).click();
		
	}*/
	

}
