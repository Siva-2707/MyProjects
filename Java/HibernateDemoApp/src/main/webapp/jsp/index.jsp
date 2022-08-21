<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Simple Hibernate demo project</h1>
	<div id="insertUser">
		<form action = "UserControllerServlet"  method="post">
			<pre>				
					Username: <input name="name" type="text">
					Age : <input name="age" type="number">
					<button type="submit" value = "insert">Insert</button>
			</pre>
		</form>
	</div>
</body>
</html>