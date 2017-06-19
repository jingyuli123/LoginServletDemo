package com.lijy.user.service;

import java.sql.SQLException;
import java.util.List;

import com.lijy.user.dao.LoginUserDao;
import com.lijy.user.model.LoginUser;
/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-3-18
 */
public class LoginUserService {
	public static void addUser(LoginUser lu){
		LoginUserDao.addUser(lu);
	}
	
	public static List<LoginUser> queryUserList() throws SQLException{
		return LoginUserDao.queryUserList();
	}
	
}
