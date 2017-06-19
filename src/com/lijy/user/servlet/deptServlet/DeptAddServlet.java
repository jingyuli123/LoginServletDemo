package com.lijy.user.servlet.deptServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lijy.user.model.DepartmentBean;
import com.lijy.user.service.DepartmentService;

/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-6-17
 */
public class DeptAddServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String deptName = request.getParameter("deptName");
		System.out.println(deptName);
		String description = request.getParameter("description");
		System.out.println(description);
		//增加部门
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptName(deptName);
		bean.setDescription(description);
		
		DepartmentService service = new DepartmentService();
		service.addDepartment(bean);
		//查询所有部门
		request.setAttribute("departmentList", service.queryDepartmentList());
		request.getRequestDispatcher("/resources/frame/listDep.jsp").forward(request, response);
//		response.sendRedirect("");
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

}

