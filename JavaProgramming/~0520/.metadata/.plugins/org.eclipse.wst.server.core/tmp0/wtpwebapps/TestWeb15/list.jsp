<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*" %>
<%
	/* Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = 
			DriverManager.getConnection(url, "scott", "1234"); */
	InitialContext ic = new InitialContext();
	DataSource ds =(DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
	Connection conn = ds.getConnection();
	String strSql = "SELECT * FROM REGISTER ORDER BY ID DESC";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	ResultSet rs = stmt.executeQuery();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
		<td>ID</td><td>이름</td><td>비밀번호</td><td>이메일</td><td>성별</td><td>국가</td>
	</tr>
	<% 
	while(rs.next()) 
	{
	%>
		<tr>
			<td><%=rs.getInt("ID")%></td>
			<td><%=rs.getString("NAME")%></td>
			<td><%=rs.getInt("PASSWORD")%></td>		
			<td><%=rs.getString("EMAIL")%></td>
			<td><%=rs.getString("SEX")%></td>
			<td><%=rs.getString("COUNTRY")%></td>
		</tr>
	<% 
	}
	rs.close();
	conn.close();
	%>
</body>
</html>