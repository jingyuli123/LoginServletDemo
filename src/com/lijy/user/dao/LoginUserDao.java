package com.lijy.user.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lijy.user.model.LoginUser;
import com.lijy.user.util.DBUtil;
/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-3-18
 */
public class LoginUserDao {
	/**
	 * 增加用户
	 */
	public static void addUser(LoginUser lu) {
		Connection conn = DBUtil.getConnection();
		String sql = "" + "insert into users" + "(username,password)"
				+ "values(" + "?,?)";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, lu.getUsername());
			ptmt.setString(2, lu.getPassword());
			ptmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/** 查询单个用户 */
	public static boolean queryUser(LoginUser lu) throws SQLException{
		Connection conn = DBUtil.getConnection();
		String sql = "select username, password from users where username = ? and password = ?";
		
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, lu.getUsername());
		ptmt.setString(2, lu.getPassword());
		
		ResultSet rs = ptmt.executeQuery();
		return rs.next();
	}
	
	public static LoginUser singleUser(String username,String password){
		Connection conn = DBUtil.getConnection();
		String sql = "select username,password from users where username = ? and password = ?";
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		LoginUser lu = null;
		try {
			ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1, username);
			ptmt.setString(2, password);
			
			rs = ptmt.executeQuery();
			while(rs.next()){
				lu = new LoginUser();
				lu.setUsername(rs.getString(1));
				lu.setPassword(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lu;
	}
	
	//查询所有用户
	public static List<LoginUser> queryUserList() throws SQLException{
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select a.username,a.password from users a");
		List<LoginUser> userList = new ArrayList<LoginUser>();
		
		LoginUser loginUser = null;
		while(rs.next()) {
			loginUser = new LoginUser();
			loginUser.setUsername(rs.getString("a.username"));
			loginUser.setPassword(rs.getString("a.password"));
			userList.add(loginUser);
		}
		
		return userList;
	}
	
	public static void main(String[] args) throws SQLException {
		List<LoginUser> list = queryUserList();
		
		for (int i = 0,size = list.size(); i < size; i++) {
//			System.out.println(list.get(i));
			LoginUser lu = list.get(i);
			System.out.println(lu.getUsername() + ", password " + lu.getPassword());
			
		}
		
//		LoginUser lu = new LoginUser();
//		lu.setUsername("刘正");
//		lu.setPassword("345");
//		boolean s = queryUser(lu);
//		System.out.println(s);
		
//		LoginUser lus = singleUser("刘正","3456");
//		System.out.println(lus.getUsername()+", "+lus.getPassword());
//		if(lus==null){
//			System.out.println("kong");
//		}
	}
}
