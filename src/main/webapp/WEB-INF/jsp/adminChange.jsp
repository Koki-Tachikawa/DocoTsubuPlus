<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者情報変更</title>
</head>
<body>
<h1>管理者情報変更</h1>
<form action="/DocoTsubuPlus/AdminChange" method="post">
新管理者名 ： <input type="text" name="newAdminName"><br>
新パスワード ： <input type="password" name="newAdminPass"><br>
<input type="submit" value="送信">
</form>
</body>
</html>