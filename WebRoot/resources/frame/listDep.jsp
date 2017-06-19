<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<style type="text/css">
		.table1 {
			border: 1px solid #ddd;
			width: 900px;
		}

		thead {
			background-color: lightblue;
		}
		</style>
		<script type="text/javascript">
			function deleteBatch(){
				var all = document.getElementById("all");
				if (all.checked == true) {
					var deptName = document.getElementsByName("deptName");
					var i;
					for (i = 0;i < deptName.length; i++){
						deptName[i].checked = true;						
					}
				} else {
					var deptName = document.getElementsByName("deptName");
					var i;
					for (i = 0;i < deptName.length; i++){
						deptName[i].checked = false;						
					}
				}
			}
		</script>
	</head>
	<body>
		<table border="0" width="900px">
			<tr>
				<td align="center" style="font-size: 24px; color: #666">
					部门管理
				</td>
			</tr>
			<tr>
				<td align="right">
					<a href="addDepartment.jsp">添加</a>
					<a href="">删除</a>
				</td>
			</tr>
		</table>
		<br />
		<table cellspacing="0" border="1" class="table1">
			<thead>
				<tr>
					<th><input type="checkbox" id="all" onclick="deleteBatch()" /></th>
					<th width="450">部门名称</th>
					<th width="450">编辑</th>
				</tr>
			</thead>
			<tbody>
			 <c:forEach items="${departmentList}" var="department" varStatus="status">
			 	<tr>
			 		<td><input type="checkbox" name="deptName" value="${department.deptName}" /></td>
			 		<td>${department.deptName}</td>
			 		<td align="center">
						<a href="editDept.jsp"><img
								src="${pageContext.request.contextPath }/resources/images/edit.png" />
						</a>
					</td>
			 	</tr>
			 </c:forEach>
				
			</tbody>
		</table>
		<br />


		<table border="0" cellspacing="0" cellpadding="0" width="900px">
			<tr>
				<td align="right">
					<span>第1/3页</span>
					<span>
					<a href="#">[首页]</a>&nbsp;&nbsp;
					<a href="#">[上一页]</a>&nbsp;&nbsp;
					<a href="#">[下一页]</a>&nbsp;&nbsp;
					<a href="#">[尾页]</a>&nbsp;&nbsp;
					</span>
				</td>
			</tr>
		</table>
	</body>
	
</html>