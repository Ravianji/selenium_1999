package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileExistsException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execl_data_provider {
public static void main(String[] args) throws Exception {
	File exele=new File("./src/test/resources/Data driven testing.xlsx");
	System.out.println(exele.exists());
	FileInputStream fis=new FileInputStream(exele);
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheetname=workbook.getSheet("Sheet1");
	int totlerow=sheetname.getPhysicalNumberOfRows();
	int totlecolumn=sheetname.getRow(0).getPhysicalNumberOfCells();
	
	for(int i=1;i<totlerow;i++)
	{
		for (int k=0;k<totlecolumn;k++)
		{
			System.out.println(sheetname.getRow(i).getCell(k));
		}
		System.out.println("");
	}
	
	
	
}
}
