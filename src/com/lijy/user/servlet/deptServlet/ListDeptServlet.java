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
 * @date : 2017-6-18
 */
public class ListDeptServlet extends HttpServlet {
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		DepartmentService service = new DepartmentService();
		req.setAttribute("departmentList", service.queryDepartmentList());
		req.getRequestDispatcher("/resources/frame/listDep.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
}

