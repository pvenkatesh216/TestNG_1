package reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Utilities 
{
	ExtentReports report;
	ExtentTest logger;
	WebDriver d;
	
	@BeforeSuite
	public void report()
	{
		report=new ExtentReports("D:\\Selenium\\Reports.MyReports.html");
	}
	
	public static String CaptureSS(WebDriver d, String Screenshotname)
	{
		
			
		try 
		{
			TakesScreenshot ts= (TakesScreenshot)d;
			File source= ts.getScreenshotAs(OutputType.FILE);
			String dest="D:\\Selenium\\ScreenShots\\"+Screenshotname+".png";
			File destination= new File (dest);
			FileUtils.copyFile(source, destination);
			return dest; //Screenshotname;
		} 
		catch (Exception e) {
			
		System.out.println("Exception while taking the screenshot"+e.getMessage());
		e.printStackTrace();
		return e.getMessage();
		}
	}
	
	@AfterSuite
	public void tearDown(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			//String SSPath=Utilities.CaptureSS(d, result.getName());
			String SSPath=CaptureSS(d, result.getName());
			//logger.log(LogStatus.FAIL, "Title Verification");
			logger.log(LogStatus.FAIL, "Title Verification", SSPath);
		}
		report.endTest(logger);
		report.flush();
		
		d.get("D:\\Selenium\\Reports.MyReports.html");
		
	}

}
