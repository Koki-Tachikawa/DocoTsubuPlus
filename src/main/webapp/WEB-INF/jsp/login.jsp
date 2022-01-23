<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<h1>ログイン</h1>
<form action="/DocoTsubuPlus/Login2" method="post">
ユーザー名 ： <input type="text" name="loginUserName"><br>
パスワード ： <input type="password" name="loginUserPass"><br>
<input type="submit" value="送信">
</form>
</body>
</html>