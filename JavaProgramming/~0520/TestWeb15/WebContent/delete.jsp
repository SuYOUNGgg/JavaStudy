<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" import="javax.sql.*" import="javax.naming.*" import="java.util.*" %>
<%@page import="com.test.dao.*" import="com.test.beans.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String Id = request.getParameter("Id");
	Register r= RegisterDao.getRecordById(Integer.parseInt(Id));
	RegisterDao.delete(Integer.parseInt(Id));
	response.sendRedirect("list.jsp");
%>
</body>
</html>