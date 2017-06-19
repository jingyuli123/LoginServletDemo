package com.lijy.user.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * @description: 读取数据库配置工具类
 * 
 * @author : lijy
 * @date : 2017-3-18
 */
public class PropertiesUtil {
	private static Properties mConfig;
	public static String DRIVER;
	public static String URL;
	public static String USR;
	public static String PASSWORD;
	static{
		mConfig = new Properties();
		Class<?> configClass = null;
		InputStream is = null;
		try {
			configClass = Class.forName("com.lijy.util.PropertiesUtil");
			is = configClass.getResourceAsStream("/jdbc.properties");
//			InputStream is = configClass.getResourceAsStream("jdbc.properties");在包内
			mConfig.load(is);
			System.out.println("加载JDBC文件成功！");
			DRIVER = mConfig.getProperty("jdbc.driver");
			URL = mConfig.getProperty("jdbc.url");
			USR = mConfig.getProperty("jdbc.usr");
			PASSWORD = mConfig.getProperty("jdbc.password");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
//		String driver = mConfig.getProperty("jdbc.driver");
		System.out.println(DRIVER);
		System.out.println(URL);
		System.out.println(USR);
		System.out.println(PASSWORD);
	}
}
