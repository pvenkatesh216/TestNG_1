package generalClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GmailLogin {
	WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.id("identifierId")).sendKeys("pvenkatesh216");
	  d.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	  d.findElement(By.name("password")).sendKeys("GmailPassword!1");
	  d.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
	  d= new ChromeDriver();
	  d.get("http://www.gmail.com");
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
