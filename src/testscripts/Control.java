package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import genericlib.MethodCall;

public class Control 
{
	static String reg_id=null;
	@Test
	public void controlmethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		File src=new File("J:\\eclipse\\Call\\Gmail\\testdata\\TestData.xlsx");
		FileInputStream file=new FileInputStream(src);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet("TestCase");
		System.out.println("Hi");
		for(int i=0;i<=sh.getLastRowNum();i++)
		{

			if(sh.getRow(i).getCell(1).getStringCellValue().equals("Y"))
			{
				reg_id=sh.getRow(i).getCell(0).getStringCellValue();
				//System.out.println(reg_id);

				for(int j=0;j<=sh.getRow(0).getLastCellNum();j++)
				{

					Sheet sh1=wb.getSheet("Scenario");
					//System.out.println((sh1.getRow(0).getCell(j).getStringCellValue()));
					//System.out.println(sh1.getRow(0).getCell(j+2).getStringCellValue());
					if(sh1.getRow(0).getCell(j).getStringCellValue().equals(reg_id))
					{

						int k=1;
						while (k<=sh1.getLastRowNum())
						{
							//System.out.println(sh1.getRow(k).getCell(j).getStringCellValue());
							//System.out.println(sh1.getRow(k).getCell(j+1).getStringCellValue());
							

							MethodCall.execution(sh1.getRow(k).getCell(j+1).getStringCellValue(),sh1.getRow(k).getCell(j).getStringCellValue());
                            
							Thread.sleep(2000);
							k++;
						}
					}
				}
			}
		}
	}



}
