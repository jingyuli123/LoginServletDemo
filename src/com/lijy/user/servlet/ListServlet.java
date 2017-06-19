package com.lijy.user.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lijy.user.service.LoginUserService;

/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-5-28
 */
public class ListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		try {
			req.setAttribute("messageList", LoginUserService.queryUserList());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/list.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}

