<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*,java.util.List" %>
<%
	List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
	User loginUser = (User)session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶメイン</title>
</head>
<body>
<h1>ようこそ どこつぶへ</h1>
<h2><%=loginUser.getName() %>さん</h2>
<a href="/DocoTsubuPlus/Logout"><input type="button" value="ログアウト"></a><br>
<a href="/DocoTsubuPlus/UserChange"><input type="button" value="ユーザー情報変更"></a><br>
<a href="/DocoTsubuPlus/AdminLogin"><input type="button" value="管理者ページ"></a><br>
<br>
<form action="/DocoTsubuPlus/Main" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">
</form>
<br>
<% if(mutterList.size()==0){ %>
	<p>つぶやきがありません</p>
<% }else{ %>
	<% for(int i=mutterList.size()-1;i<=0;i++){ %>
		<p><%= mutterList.get(i).getUserName() %> ： <%= mutterList.get(i).getText() %></p>
	<% } %>
<% } %>
</body>
</html>