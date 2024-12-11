package com.epdom.propertyfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static FileInputStream fis;
	public static Properties pr;
	public static FileOutputStream fos;
	public static String readdata(String key) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\varun\\eclipse-workspace\\com.epdom\\src\\test\\resources\\Data\\testdata.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pr=new Properties();
		try {
			pr.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = pr.getProperty(key);
		return data;
		
	}
	public static void writedata(String key,String value) {
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pr=new Properties();
		try {
			pr.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pr.put(key, value);
		try {
			fos=new FileOutputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.store(fos, "data written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
