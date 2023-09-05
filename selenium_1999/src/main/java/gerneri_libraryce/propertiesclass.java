package gerneri_libraryce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesclass extends Baseclass2{
	 public String readingDataFromPropertFile(String key)
	{	
		FileInputStream fis = null;
		try {
			fis=new FileInputStream(properties);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			 Properties property=new Properties();
			 try {
				property.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			 return property.getProperty(key);
		}
	}	
