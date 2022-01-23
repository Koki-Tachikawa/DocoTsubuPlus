<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報変更</title>
</head>
<body>
<h1>ユーザー情報変更</h1>
<form action="/DocoTsubuPlus/UserChange" method="post">
新ユーザー名 ： <input type="text" name="newLoginName"><br>
新パスワード ： <input type="password" name="newLoginPass"><br>
<input type="submit" value="送信">
</form>
</body>
</html>