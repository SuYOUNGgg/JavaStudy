<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.beans.*"%>
<%@ page import="com.test.dao.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insert.jsp">추가</a>
	<table border="1">
	<tr>
		<td>사번</td>
		<td>이름</td>
		<td>이메일</td>	
	</tr>
	<%
	List<Employee> list = EmployeeDao.getAllRecords();
	for(Employee r : list){
		%>
		<tr> 
				<td><%=r.getId()%></td>
				<td><a href="view.jsp?id=<%=r.getId()%>"><%=r.getName()%></a></td>
				<td><%=r.getEmail()%></td>
				<td><a href="delete.jsp?id=<%=r.getId()%>">삭제</a></td>	
		</tr>
		<%
		}
		%>	 
	</table>
</body>
</html>