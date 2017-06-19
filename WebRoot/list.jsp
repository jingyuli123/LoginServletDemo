<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>列表List</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    
    <style type="text/css">
       *{
         margin:0;
         padding:0;
       }
       #header{
          width:100%;
          height:20px;
       }
       #footer{
          background:#000;
          width:100%;
          height:20px;
       }
       #mainbody{
          background: #ccc;
          height:800px;
       }
       .left{
          hehght:800px;
          width:20%;
          float:left;
       }
       .right{
       	  width:80%;
       	  height:100px;
       	  float:left;
       }
       ul li label{
           float:left;
           position:relative;
           left:80px;
       }
       ul li{
         border-bottom: 1px solid #DFDFDF;
         padding:12px;
       }
       a{
       	  text-decoration: none;
       }
    </style>
    
  </head>
  
  <body style="background: #e1e9eb;">
  	 <div id="header"></div>
  	 <div id="mainbody">
  	    <div class="left">
  	      <ul>
  	           <li>
  	               <label><a class="index" href="List.action">用户列表</a></label>
  	           </li>
  	      </ul>
  	    </div>
  	    <div class="right">
				<table class="tab2" width="100%">
					<tbody>
						<tr>
							<th>
								序号
							</th>
							<th>
								用户名
							</th>
							<th>
								密码
							</th>
							<th>
								操作
							</th>
						</tr>

						<c:forEach items="${messageList}" var="message" varStatus="status">

							<tr
								<c:if test="${status.index%2==0}">style="background-color:#ECF6EE;"</c:if>>
					
								<td style="text-align: center">
									${status.index+1}
								</td>
								<td style="text-align: center">
									${message.username}
								</td>
								<td style="text-align: center">
									${message.password}
								</td>
								<td style="text-align: center">
									<a href="#">修改</a>&nbsp;&nbsp;&nbsp;
									<a href="">删除</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>   
  	 </div>
  	 <div id="footer"></div>
  </body>
</html>
