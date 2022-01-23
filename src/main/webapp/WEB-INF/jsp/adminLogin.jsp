<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者ログイン</title>
</head>
<body>
<h1>管理者ログイン</h1>
<form action="/DocoTsubuPlus/AdminLogin" method="post">
ユーザー名 ： <input type="text" name="adminName"><br>
パスワード ： <input type="password" name="adminPass"><br>
<input type="submit" value="送信">
</form>
</body>
</html>