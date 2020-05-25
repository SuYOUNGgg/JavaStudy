<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@page import="com.test.dao.*" import="com.test.beans.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("Id");
	Employee r= EmployeeDao.getRecordById(Integer.parseInt(id));
%>
<form action=updateProcess.jsp method=get>
사번 : <input type="text" name=Id value=<%=r.getId()%>><br>
이름 : <input type="text" name=Name value=<%=r.getName()%>><br>
이메일 : <input type="text" name=Email value=<%=r.getEmail()%>><br>
<input type=submit value=저장><input type=reset value=다시입력>
</form>
</body>
</html>