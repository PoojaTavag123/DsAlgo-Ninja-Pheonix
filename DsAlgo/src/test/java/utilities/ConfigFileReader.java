package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= "config/project.properties";

	
	public ConfigFileReader() {
		BufferedReader reader;
		//System.out.print("###### I am in config file reader");
		try {
			//System.out.print("###### I am in config file reader + try");
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			//System.out.print("###### I am in config file reader + catch");
			e.printStackTrace();
			throw new RuntimeException("project.properties file not found at " + propertyFilePath);
		}		
	}
	
	
	public String getConfigPropertyValue(String key) {
		//System.out.print("###### I am in config file reader + get Value");
		String value = properties.getProperty(key);
		if(value != null) return value.trim();
		else throw new RuntimeException(key+" not specified in the project.properties file.");
	}

}

	