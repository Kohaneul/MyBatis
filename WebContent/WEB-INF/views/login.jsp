<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>
<h1>아이디/비밀번호 입력</h1>
<form method='POST' action="<c:url value='login'/>">
<input type="text" name="id" placeholder="ID입력"/>
<input type="password" name="password" placeholder="비밀번호 입력"/>
<input type="submit" value="제출"/>
</form>
</body>
</html>