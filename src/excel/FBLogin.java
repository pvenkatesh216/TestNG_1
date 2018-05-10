package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	
	public static void main(String[] args) throws Exception {
		File src= new File("D:\\Selenium\\TestData\\FBLogin.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheetAt(0);
		int x=ws.getLastRowNum();
		
		for (int i=1; i<=x; i++)
		{
			String usname=ws.getRow(i).getCell(0).getStringCellValue();
			String paswd=ws.getRow(i).getCell(1).getStringCellValue();
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			d.get("http://www.facebook.com");
			d.findElement(By.id("email")).sendKeys(usname);
			d.findElement(By.id("pass")).sendKeys(paswd);
				
		}

	}

}
