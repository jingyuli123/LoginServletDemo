<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<!doctype html>
<html>
<head>
<style type="text/css">
.div1{ margin-top:50px; margin-left:600px; font-size:14px; color:white}
</style>
</head>

<body bgcolor="#0099FF">
<div class="div1">
         <% 
		     String loginUser = "";
		     if(session.getAttribute("loginUser")!=null)
		     {
		        loginUser = session.getAttribute("loginUser").toString();
		     }
		  %>
欢迎您:${loginUser}
</div>
</body>
</html>
