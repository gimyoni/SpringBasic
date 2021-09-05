<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="val" items ="${temp}">
<!-- 	temp에 있는 값을 하나씩 val에다가 자동으로 넣는다. -->		
		${val.ID}, ${val.PW}
	</c:forEach>
</body>
</html>