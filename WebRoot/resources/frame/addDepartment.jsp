<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<title>部门添加</title>	
	</head>
	<style type="text/css">
		*{
	      margin:0;
	      padding:0;
	      color:#346667;
	      font-family: Arial, Helvetica, sans-serif,"宋体";
	      list-style: none;
	    }
		input {height:30px; width:400px; padding:5px 8px;}
	</style>
	<script type="text/javascript">
		
		function isubmit(){
		    alert(1);
			document.getElementById("IForm").submit();
		}
	</script>
	
<body>
	<form id="IForm" method="post" action="${pageContext.request.contextPath }/deptAdd.action">
		<table border="0" width="600px">
			<tr>
				<td align="center" style="font-size: 24px; color: #666">
					部门添加
				</td>
			</tr>
			<tr>
				<td align="right">
					<a href="javascript:isubmit()" >保存</a> &nbsp;&nbsp;
					<a href="listDep.jsp">退回 </a>
				</td>
			</tr>
		</table>
		<br />
		<br>
		<table style="font-size: : 16px">
			<tr>
				<td style="width:500px">
					部门名称：
				</td>
				<td>
					<input type="text" name="deptName"/>
				</td>
			</tr>
			<tr>
				<td>
					部门介绍：
				</td>
				<td></td>
			</tr>
			<tr>
				<td width="10%"></td>
				<td>
					<textarea cols="50" rows="5" name="description">ckeditor</textarea>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
