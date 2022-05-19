<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="ProcessLogin" method="post">
		<pre>
		User: <input type="text" name="uname" required="required">
		Pass: <input type="password" name="pass" required="required">
		<input type="submit" value="Login"/>
		</pre>
	</form>
	<a href="signup.jsp">New user? Signup.</a>
</body>
</html>