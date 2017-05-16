package com.myd.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configure {
	private Properties p;

	public Configure() {
		InputStream is = getClass().getResourceAsStream("/location.properties");
		p = new Properties();
		try {
			p.load(is);
			is.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Configure(String fileName) {
		InputStream is = getClass().getResourceAsStream(fileName);
		p = new Properties();
		try {
			p.load(is);
			is.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public Properties getProperties() {
		return p;
	}

	public static String getProperty(String name) {
		Configure c = new Configure();
		Properties p = c.getProperties();
		return p.getProperty(name);
	}

	//test
	public static void main(String[] args) {
		Configure c = new Configure("/location.properties");
		Properties p = c.getProperties();
		System.out.println(">>>>>" + p.getProperty("verName"));
	}
}
