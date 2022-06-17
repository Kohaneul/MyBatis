<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
</head>
<body>
<center>
<table border="solid 1px">
<thead>
<tr>
	<th>아이디</th>
	<th>이름</th>
</tr>
</thead>
<tbody>
<c:forEach items="#{list}" var = "list">
	<tr>
<<<<<<< HEAD
	<td><a href="detail?id=${list.id}" name = "id">${list.id}</a></td>
	<td>${list.name}</td>

	</tr>

</c:forEach>
</tbody>
</table>
<a href="main"><button>메인</button></a>
</center>
</body>
</html>



=======
	<td><a href="detail" name = "id">${list.id}</td></a>
	<td>${list.name}</td>

	</tr>

</c:forEach>
</tbody>
</table>
<a href="main"><button>메인</button></a>
</center>
</body>
</html>
>>>>>>> branch 'main' of https://github.com/Kohaneul/MyBatis.git
