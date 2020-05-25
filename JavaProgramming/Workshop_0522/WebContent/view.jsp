<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	String id = request.getParameter("id");
	Employee r = EmployeeDao.getRecordById(Integer.parseInt(id));
%>
	<table border="1">
	<tr>
		<td>사번 :</td><td><%=r.getId()%></td>
	</tr>
	<tr> 
		<td>이름 :</td><td><%=r.getName()%></td>
	</tr>
	<tr>
		<td>이메일 :</td><td><%=r.getEmail()%></td>
	</tr>
	</table>
	<a href="list.jsp">목록&nbsp;</a><a href="update.jsp">수정</a>&nbsp;<a href="delete.jsp?dept_id=">삭제</a>
</body>
</html>