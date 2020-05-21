<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if(id.isEmpty() || pwd.isEmpty()) {
		request.setAttribute("error", "ID 또는 비밀번호를 입력해주세요!");
		RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
		rd.forward(request, response);
		return;
	}

%>
</body>
</html>