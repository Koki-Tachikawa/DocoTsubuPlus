<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User adminUser = (User)application.getAttribute("adminUser");
boolean isChangeAdmin = (boolean)request.getAttribute("isChangeAdmin");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者情報変更</title>
</head>
<body>
<% if(isChangeAdmin){ %>
	<h2>管理者情報変更</h2>
	<p>新管理者名：<%=adminUser.getName() %></p>
	<p>新パスワード：<%=adminUser.getPass() %></p>
<% }else{ %>
	<h2>管理者情報変更失敗</h2>
<% } %>
<a href="/DocoTsubuPlus/Admin"><input type="button" value="管理者トップへ"></a><br>
<a href="/DocoTsubuPlus/Welcome"><input type="button" value="トップへ"></a><br>
</body>
</html>