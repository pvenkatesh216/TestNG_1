package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.freecrm.com");
		Thread.sleep(3000);
		d.findElement(By.name("username")).sendKeys("pvenkatesh216");
		d.findElement(By.name("password")).sendKeys("Password1!");
		d.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		Thread.sleep(2000);
		d.switchTo().frame("mainpanel");
		d.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		
		////*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
		////*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]
		////*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]
		/*String Before_XPath="//*[@id='vContactsForm']/table/tbody/tr[";
		String After_XPath="]/td[2]";
		
				
		for (int i=4; i<=6; i++)
		{
			String name=d.findElement(By.xpath(Before_XPath + i + After_XPath)).getText();
			System.out.println(name);
			if(name.contains("welcome user"))
			{
				d.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}*/
				
      d.findElement(By.xpath("//a[(contains(text(),'welcome'))]/parent::td/preceding-sibling::td//input[@name='contact_id']")).click();
      
	}

}
