package generalClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.facebook.com");
				
		/*List<WebElement> AllLinks=d.findElements(By.tagName("a"));
		int count=AllLinks.size();
		System.out.println(count);
		for (int i=0;i<=count; i++)
		{
		     String name=AllLinks.get(i).getText();
		     System.out.println(name);
		}*/
		
		d.findElement(By.xpath("//*[@id='email123']")).sendKeys("Hi");
		//List<WebElement> AllDays=d.findElements(By.xpath("//*[@id='day']"));
		//String first=AllDays.get(0).getText();
		//System.out.println(first);
		
	d.quit();

	}

}
