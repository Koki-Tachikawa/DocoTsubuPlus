<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User loginUser = (User)session.getAttribute("loginUser");
boolean isChangeUser = (boolean)request.getAttribute("isChangeUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報変更</title>
</head>
<body>
<% if(isChangeUser){ %>
	<h2>ユーザー情報変更</h2>
	<p>新ユーザー名：<%=loginUser.getName() %></p>
	<p>新パスワード：<%=loginUser.getPass() %></p>
<% }else{ %>
	<h2>ユーザー登録失敗</h2>
<% } %>
<a href="/DocoTsubuPlus/Welcome"><input type="button" value="トップへ"></a><br>
</body>
</html>