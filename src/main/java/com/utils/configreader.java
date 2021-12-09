package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

 

public class configreader {
	
	public Properties readprop() throws IOException {
	
	FileInputStream fil = new FileInputStream("src/test/resources/config/config.properties");
	Properties prop = new Properties();
	prop.load(fil);
	 return prop;
	}

}
