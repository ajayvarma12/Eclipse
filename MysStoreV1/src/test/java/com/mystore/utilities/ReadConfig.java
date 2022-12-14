package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties properties;

	String path = "C:\\Users\\Dell\\eclipse-workspace\\MysStoreV1\\src\\test\\java\\com\\mystore\\utilities\\ReadConfig.java";

	public ReadConfig() {
		try {
			properties = new Properties();

			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getBaseUrl() {
		String value = properties.getProperty("baseUrl");

		if (value != null)

			return value;

		else
			throw new RuntimeException("url not specified in config file.");
	}

	public String getBrowser() {
		String value = properties.getProperty("browser");

		if (value != null)

			return value;

		else
			throw new RuntimeException("url not specified in config file.");
	}

}
