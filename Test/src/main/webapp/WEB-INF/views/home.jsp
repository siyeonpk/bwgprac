<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	사용자 정보 출력 
</h1>

<!-- 
<P>  The time on the server is ${serverTime}. </P>
 -->
<p> 해당 사용자의 아이디는 [${userId }]이며, 사용자명은 [${userName }]입니다.</p>

</body>
</html>
