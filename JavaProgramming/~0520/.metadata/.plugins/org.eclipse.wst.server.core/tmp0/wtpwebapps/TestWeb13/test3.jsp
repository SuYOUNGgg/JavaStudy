<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public int add(int a, int b) {
	return a+b;
}
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=this.add(10,20) %> <br>
	
	<%!
		public int sum(int a,int b) {
		return a+b;
	}
	%> 
	덧셈의 결과 : <%= this.sum(20,30) %>
</body>
</html>