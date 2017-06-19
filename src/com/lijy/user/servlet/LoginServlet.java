package com.lijy.user.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lijy.user.dao.LoginUserDao;
import com.lijy.user.model.LoginUser;
/**
 * @description: ¿ØÖÆ²ã
 * 
 * @author : lijy
 * @date : 2017-3-18
 */
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		LoginUser lu = new LoginUser();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		if ("".equals(username) || username == null){
			return;
		}
		if ("".equals(password) || password == null){
			return;
		}
		
		
		lu.setUsername(username);
		lu.setPassword(password);
		
		try {
			if (LoginUserDao.queryUser(lu)){
				request.getSession().setAttribute("loginUser", lu.getUsername());
				response.sendRedirect("frame.jsp");
			} else {
				response.sendRedirect(request.getContextPath() + "/login_fail.jsp");
			}
			
			//LoginUserService.addUser(lu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
