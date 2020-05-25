<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.naming.*"%>
<%@ page import="com.test.beans.*" %>    
<%@ page import="com.test.dao.*" %>
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
	String Email=request.getParameter("Email");
	Employee r=new Employee();
	r.setId(Integer.parseInt(Id));
	r.setName(Name);
	r.setEmail(Email);
	EmployeeDao.insert(r);
	response.sendRedirect("list.jsp");
%>

</body>
</html>