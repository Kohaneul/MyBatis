<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>

<h2>[ ${customer.id} ] 님의 상세정보</h2>
이름 : ${customer.name}<br>
비밀번호 : ${customer.password}<br>
휴대폰번호 : ${customer.phone}<br>
<a href="main"><button>홈</button></a>

</center>
</body>
</html>