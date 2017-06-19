<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登录表单</title>
    <script type="text/javascript">
        var names = document.getElementsByTagName("input");
        function leave(){
           if (names[0].value=="") {
             alert("用户名不能为空");
           }
        }
        function message(){
           if (names[1].value == ""){
             alert("密码不能为空");
           }
        }
        function check(){
           if (names[0].value == ""){
              alert("姓名不能为空！");
              return false;              
           }
           if (names[1].value == "") {
              alert("密码不能为空");
              return false;
           }
           return true;
        }
    </script>
    <style type="text/css">
    
      body{
        margin: 0;
        padding: 0;
      }
      .head{
         background:#333;
      }
      .main{
         margin:0 auto;
      }
      .footer{
         height: 20px;
         width: 800px;
         background: #ccc;
         margin:0 auto;
      }
      h2{
        text-align: center;
      }
    </style>
  </head>
  
  <body>
    <h2>登录表单</h2>
    <div class="head">head</div>
    <form action="loginServlet" method="post" >
    <div >
    <table class="main">
       <tr>
           <td style="text-align: center;">用户名：</td>
           <td><input type="text" name="username" value="" onblur="leave()"/></td>
       </tr>
       <tr>
           <td style="text-align: center;">密码:</td>
           <td><input type="password" name="password" value="" onblur="message()"/></td>
       </tr>
       <tr>
           <td colspan="2"><span style="margin:0 auto"><input type="submit" value="登录" onclick="check();" />&nbsp;&nbsp;<input type="button" value="注册" onclick="open()"/></span></td>
       </tr>
    </table>
    </div>		
    </form>
    <div class="footer"></div>
  </body>
</html>
