package Hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import QA.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class apphooks 
{
	Driverfactory df;
	WebDriver driver;
	
	@Before
	public void LaunchBrowser() throws IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\BDDCucumber\\11_Jan_BDDCucumber\\src\\test\\resources\\config.properties");
		Properties prop=new Properties();
		prop.load(file);
		String BN=prop.getProperty("Browser");  //Chrome
		df=new Driverfactory();
		driver=df.initBrowser(BN);  // //Chrome
		driver.manage().window().maximize();
	
	}
	
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	
	/*@AfterStep
	public void postaction(Scenario sc)
	{
		byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", screenshot.toString());
		
	} */
	
	
	@AfterStep
	public void postaction(Scenario sc) //Passed  //Failed
	{
		if(sc.isFailed()) //false  //true
		{	
		byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", screenshot.toString());
		}
	}
	
	

}
