<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册列表</title>
<style type="text/css">
  *{
    margin:0;
    padding:0;
    color:#346667;
    font-family: Arial, Helvetica, sans-serif,"宋体";
    list-style: none;
  }
  .header{
     height:20px;
     margin: 0 auto;
     background: #346667;
  }
  .main{
     height:auto;
     width:700px;
     background: #F6F6F6;
     margin:40px auto;
     padding:10px;
  }
  .main ul{
     width:700px;
  }
  .main ul li{
    border-bottom: 1px solid #DFDFDF;
    padding:12px;
  }
  .main ul li label{
    width:120px;
    display: inline-block;
    float:left;
  }
  .main ul li input[type=text]{
    width:220px;
    height:20px;
    border:1px solid #AAAAAA;
    padding:3px 8px;
  }
  .main ul li input[type=password]{
    width:220px;
    height:20px;
    border:1px solid #AAAAAA;
    padding:3px 8px;
  }
  .footer{
     height:20px;
     width:700px;
     background:#346667;
     margin:0 auto;
  }
</style>
</head>
<body>
<div class="header"></div>
<div class="main">
<form action="#" method="post" name="typeForm" >
    <ul>
       <li>
           <label>姓名：</label>
           <input type="text" name="username" value="" />
        </li>
        <li>
           <label>证件号：</label>
           <input type="text" name="certId" value="" />
        </li>
        <li>
           <label>手机号：</label>
           <input type="text" name="mobileno" value="" />
        </li>
        <li>
           <label>密码：</label>
           <input type="password" name="password1" value="" />
        </li>
        <li>
           <label>再次确认密码：</label>
           <input type="password" name="password2" value="" />
        </li>
        <li>
           <button> 提交</button>
        </li>
    </ul>
</form>
</div>

<div class="footer"></div>
</body>
</html>