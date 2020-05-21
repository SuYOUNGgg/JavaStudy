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
	String Id=request.getParameter("Id");
	String Name=request.getParameter("Name");
	String Password=request.getParameter("Password");
	String Email=request.getParameter("Email");
	String Sex=request.getParameter("Sex");
	String Country=request.getParameter("Country");
	Register r=new Register();
	r.setId(Integer.parseInt(Id));
	r.setName(Name);
	r.setPassword(Password);
	r.setEmail(Email);
	r.setSex(Sex);
	r.setCountry(Country);
	RegisterDao.insert(r);
	response.sendRedirect("list.jsp");
%>
</body>
</html>
