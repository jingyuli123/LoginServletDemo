package com.lijy.user.servlet.deptServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lijy.user.service.DepartmentService;

/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-6-25
 */
public class DeleteOneServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		req.setCharacterEncoding("UTF-8");
		String deptname = req.getParameter("deptName");
		deptname = new String(deptname.getBytes("ISO-8859-1"),"utf-8");
		DepartmentService deService = new DepartmentService();
		deService.deleteOne(deptname);
		req.getRequestDispatcher("/listDept.action").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
}

