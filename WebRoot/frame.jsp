<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<frameset rows="80,*">
   <frame name="top" src="${pageContext.request.contextPath }/resources/frame/top.jsp">
   <frameset cols="150,*" id="main">

      <frame src="${pageContext.request.contextPath }/resources/frame/left.jsp"> 
     <frame name="right" src="${pageContext.request.contextPath }/resources/frame/right.html">
   </frameset>
</frameset>