package com.testbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties prop;

	public Readconfig() {
		try {
			File src = new File("./Configurations/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String URL = prop.getProperty("baseURL");
		return URL;
	}
	public String getChromePath() {
		String ChromePath=prop.getProperty("Chromepath");
		return ChromePath;
				
	}
	public String getFirefoxPath() {
		String Firefoxpath=prop.getProperty("Firefoxpath");
		return Firefoxpath;
				
	}
	public String getIEPath() {
		String IEPath=prop.getProperty("IEpath");
		return IEPath;
}
	public String FirstName() {
		String Fname=prop.getProperty("Fname");
		return Fname;
	}
	public String LastName() {
		String Lname=prop.getProperty("Lname");
		return Lname;
	}
	
		public String Pincode() {
			String pincode=prop.getProperty("pincode");
			return pincode;
		}
}
