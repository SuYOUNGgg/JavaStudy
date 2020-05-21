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
	String id = request.getParameter("Id");
	Register r= RegisterDao.getRecordById(Integer.parseInt(id));
%>
<form action=updateProcess.jsp method=get>
id: <input type="text" name=Id value=<%=r.getId()%>><br>
이름: <input type="text" name=Name value=<%=r.getName()%>><br>
비밀번호: <input type="text" name=Password value=<%=r.getPassword()%>><br>
이메일: <input type="text" name=Email value=<%=r.getEmail()%>><br>
성별: <input type="text" name=Sex value=<%=r.getSex()%>><br>
나라: <input type="text" name=Country value=<%=r.getCountry()%>><br>
<input type=submit value=저장><input type=reset value=다시시작>
</form>
</body>
</html>