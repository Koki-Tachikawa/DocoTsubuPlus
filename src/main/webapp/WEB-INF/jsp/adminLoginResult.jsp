<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
    <%
    boolean isAdminUser = (boolean)request.getAttribute("isAdminUser");
    User adminUser = (User)application.getAttribute("adminUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者ログイン</title>
</head>
<body>
<%if(isAdminUser){ %>
	<h2>ログイン成功</h2>
	<p>ようこそ<%=adminUser.getName() %>さん</p>
<a href="/DocoTsubuPlus/Admin"><input type="button" value="管理者トップへ"></a><br>
<%}else{ %>
	<h2>ログイン失敗</h2>
<%} %>
<a href="/DocoTsubuPlus/Welcome"><input type="button" value="トップへ"></a><br>
</body>
</html>