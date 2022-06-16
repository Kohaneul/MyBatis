<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
<h2>회원가입 입력</h2>
<form method='POST' action="<c:url value='register'/>">
<input type="text" name="id" placeholder="아이디입력"/><br>
<input type="text" name="name" placeholder="이름입력"/><br>
<input type="password" name="password" placeholder="패스워드입력"/><br>
<input type="text" name="phone" placeholder="휴대폰번호 입력"/><br>
<input type="submit" value="제출"/>
</form>
</body>
</html>