package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	
		public static void main(String[] args) throws Exception 
		{
			try{
			
			File src= new File("D:\\Eclipse\\ReadExcel\\ageTest.xlsx");
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet ws= wb.getSheetAt(0);
			int x=ws.getLastRowNum();
			
			for (int i=1; i<=x; i++)
			{
				int age=(int) ws.getRow(i).getCell(2).getNumericCellValue();
				System.out.println(age);
				//Integer intObject = new Integer(age);
				//int age1=Integer.parseInt(age);
				//System.out.println(age1);
				
				if (age>=18)
				{
					ws.getRow(i).
					
				}
				else 
					ws.getRow(i).createCell(3).setCellValue("N");
			}
			FileOutputStream fout= new FileOutputStream(src);
			wb.write(fout);
			wb.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

	}
		
}
	


