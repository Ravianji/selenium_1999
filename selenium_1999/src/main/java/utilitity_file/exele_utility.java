package utilitity_file;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exele_utility implements data_driver_file {
	@DataProvider(name="shoper_exele")
	public  static String[][] m()throws Exception {
		File file=new File(ExeclFile);
		System.out.println(file.exists());
		FileInputStream fls=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fls);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int cell=sheet.getRow(0).getPhysicalNumberOfCells();

		String[][]data=new String[row-1][cell];
		for(int i=0;i<row-1;i++)
		{
			for(int k=0;k<cell;k++)
			{
				DataFormatter df=new DataFormatter();
				data[i][k]= df.formatCellValue(sheet.getRow(i+1).getCell(k));
			}
			System.out.println(" ");
		}
		workbook.close();
		fls.close();
		return data;
	}
}
