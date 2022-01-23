<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
<h2>新規登録</h2>
<form action="/DocoTsubuPlus/NewUser" method="post">
ユーザー名 ： <input type="text" name="newUserName"><br>
パスワード ： <input type="password" name="newUserPass"><br>
<input type="submit" value="送信">
</form>
</body>
</html>