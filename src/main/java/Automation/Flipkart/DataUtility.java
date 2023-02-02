package Automation.Flipkart;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility {
	public String getDatafromProperties(String key) throws IOException
	{
		FileInputStream Fis=new FileInputStream("C:\\SELENIUM ANU\\data.propppp");
		Properties prop=new Properties();
		prop.load(Fis);
		String value=prop.getProperty(key);
		return value;
	}

}
