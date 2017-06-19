package com.lijy.user.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 
 * 
 * @author : lijy
 * @date : 2017-5-20
 */
public class ErrorFilter implements Filter {
	
	/**
	 * 声明初始化参数
	 */
	private FilterConfig filterConfig;

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		System.out.println("filterConfig");
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse reponse = (HttpServletResponse) arg1;
		
		System.out.println(request.getRequestURI());
		String noLoginPath = filterConfig.getInitParameter("noLoginPath");
		request.setCharacterEncoding("utf-8");
		if (noLoginPath != null) {
			String[] strArray = noLoginPath.split(";");
			for (int i = 0; i < strArray.length; i++) {
				if (strArray[i] == null || "".equals(strArray[i]))
					continue;
				if (request.getRequestURI().indexOf(strArray[i]) != -1) {
					arg2.doFilter(arg0, arg1);
					return;
				}
				System.out.println(request.getContextPath()+"/index.jsp");
			}
		}
		
		if (request.getSession().getAttribute("loginUser") != null) {
			arg2.doFilter(arg0, arg1);
		} else {
			reponse.sendRedirect("index.jsp");
		}
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		if ("".equals(username) || username == null || "".equals(password) || password == null){
//			reponse.sendRedirect(request.getContextPath()+"/index.jsp");
//		}
//		else {
//			arg2.doFilter(arg0, arg1);
//		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		filterConfig = arg0;
	}

}

