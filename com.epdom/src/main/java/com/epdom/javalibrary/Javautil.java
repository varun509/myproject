package com.epdom.javalibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.math3.genetics.RandomKey;
/**
 * this class provisdes the reusable methods to perform time operations related to java
 * @author varun
 * */
public class Javautil {
	
	public static void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	
	public static int generateRandomnum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
	public static  String getCurrenttime() {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
		
	}

}
