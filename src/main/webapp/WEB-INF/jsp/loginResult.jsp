<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    User loginUser = (User)session.getAttribute("loginUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<%if(loginUser == null){ %>
	<h2>ログイン失敗</h2><br>
<%}else{ %>
	<h2>ログイン成功</h2><br>
	<p>ようこそ<%=loginUser.getName() %>さん</p>
	<%} %>
<a href="/DocoTsubuPlus/Welcome"><input type="button" value="トップへ"></a><br>
</body>
</html>