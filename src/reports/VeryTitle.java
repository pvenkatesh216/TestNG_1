package reports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;
//import com.relevantcodes.extentreports.Extentreports;

public class VeryTitle extends Utilities
{
	/*ExtentReports report;
	ExtentTest logger;
	WebDriver d;*/
	
	@Test
	public void TitleTest()
	{
		try{
		
		String tName=logger.getClass().getSimpleName().toString();
		//report=new ExtentReports("D:\\Selenium\\Reports.MyReports.html");
		
		logger=report.startTest(tName);
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().window().maximize();
		logger.log(LogStatus.INFO, "Launched the Browser");
		d.get("http://www.google.com");
		logger.log(LogStatus.INFO, "Launched the Application");
		String title=d.getTitle();
		logger.log(LogStatus.INFO, "Captuted the Title");
		Assert.assertTrue(title.contains("Google"));
		logger.log(LogStatus.PASS, "Title Verified");
		
		
	}
		catch(Exception e)
		{
			throw e;
			
		}
	}
	

	
	

	
	}	


