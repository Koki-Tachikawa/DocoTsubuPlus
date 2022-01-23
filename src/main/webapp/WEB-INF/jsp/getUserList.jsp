<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*, java.util.List" %>
<%
	List<User> userList = (List<User>)application.getAttribute("userList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー名一覧</title>
</head>
<body>
<h1>ユーザー名一覧</h1>
<% for(int i=0;i<userList.size();i++){%>
	<p>ＩＤ：<%=userList.get(i).getID() %></p>
	<p>ユーザー名：<%=userList.get(i).getName() %></p>
	<p>パスワード：<%=userList.get(i).getPass() %></p><br>
<%} %><br>
<a href="/DocoTsubuPlus/Admin"><input type="button" value="管理者トップへ"></a><br>
</body>
</html>