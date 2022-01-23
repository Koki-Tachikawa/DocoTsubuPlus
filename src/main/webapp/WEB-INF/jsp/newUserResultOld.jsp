<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*"%>
<%
User newUser = (User)request.getAttribute("newUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規ユーザー登録</title>
</head>
<body>
<% if(newUser!=null){ %>
	<h2>新規登録完了</h2>
	<p>ユーザー名：<% newUser.getName(); %></p>
	<p>パスワード：<% newUser.getPass(); %></p>
	<p>ＩＤ：<% newUser.getID(); %></p>
<% }else{ %>
	<h2>新規登録失敗</h2>
<% } %>
<a href="/DocoTsubuPlus/Welcome"><input type="button" value="トップへ"></a><br>
</body>
</html>