<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "/list">list</a>
	<form action="/delete_result" method="post"> <br>
		삭제할 아이디값 <input type="text" name="ID"> <br>
		<button type="submit">전송</button>
	</form>
</body>
</html>