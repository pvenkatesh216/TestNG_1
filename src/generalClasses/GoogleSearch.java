package generalClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
	  d= new ChromeDriver();
	  d.get("http://www.google.com");
  }
}
