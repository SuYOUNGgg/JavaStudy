<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action=insertProcess.jsp method=get>
아이디: <input type="text" name=Id><br>
이름: <input type="text" name=Name><br>
비밀번호: <input type="text" name=Password><br>
이메일: <input type="text" name=Email><br>
성별: <input type="text" name=Sex><br>
나라: <input type="text" name=Country><br>
<input type=submit value=저장>  <input type=reset value=다시시작>
</form>
</body>
</html>