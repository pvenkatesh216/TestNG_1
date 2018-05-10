package strings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sorting {

	public static void main(String[] args) {
		int a[]={23,43,12,16,99,65,19,20,43};
		
		for (int i=0;i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}System.out.println(a[i]);

	}
		
		WebDriverWait wait= new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOf(element))
		
		WebDriver d;
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

}
}