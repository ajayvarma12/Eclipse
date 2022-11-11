package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	Properties properties;
	String path = "C:\\Users\\Dell\\eclipse-workspace\\MysStoreV1\\src\\test\\java\\PropertiesFileDemo\\Config.properties";

	public ReadConfigFile() {

		properties = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);

			try {
				properties.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}
		public String getURL() {
			
			String url=properties.getProperty("url");
			if(url!=null)
			return url;
			else 
				throw new RuntimeException("url not found in config file");
		}
		public String getusername() {
			
			String username=properties.getProperty("username");
			if(username!=null)
			return username;
			else 
				throw new RuntimeException("username not found in config file");
		}
		public String getpassword() {
			
			String password=properties.getProperty("password");
			if(password!=null)
			return password;
			else 
				throw new RuntimeException("password not found in config file");
		}
	}

