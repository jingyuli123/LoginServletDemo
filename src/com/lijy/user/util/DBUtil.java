package com.lijy.user.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @description: 数据库工具类
 * 
 * @author : lijy
 * @date : 2017-3-18
 */
public class DBUtil {

	private static final String URL = "jdbc:mysql://localhost/imooc";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private static Connection conn = null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}
}
