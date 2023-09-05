package utilitity_file;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.reporters.jq.Main;

public class admin implements data_driver_file{

	@DataProvider(name="Admin_area_demo",parallel = true)
	public static String[][]  m1() throws Exception
	{
		File file=new File(vi);
	    System.out.println(	file.exists());
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		int row=sheet.getPhysicalNumberOfRows();
		int cell=sheet.getRow(0).getLastCellNum();
		String[][]data=new String[row-1][cell];
		for(int i=0;i<row-1;i++)
		{
			for (int k=0;k<cell;k++)
			{
				DataFormatter af=new DataFormatter();
				data[i][k]=af.formatCellValue(sheet.getRow(i+1).getCell(k));
			}
			System.out.println(" ");
		}
		workbook.close();
		fis.close();
		
		return data;
		
	
	}
}
