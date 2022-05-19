<%@page import="com.siva.demoApp.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
	
	if(session.getAttribute("user") == null){
		response.sendRedirect("login.jsp");
	}
	
	User user = (User)session.getAttribute("user");
	
	out.println(user);
	%>


	Welcome.. {$user.getUsername} 
	
	
	<form action="FileUpload" method="post" enctype="multipart/form-data">
	<pre>
		<input type="file" name = "file" value ="Select File">
		<input type = "submit" value ="Upload"> 
	
	</pre>
	</form>
	
	<ul>
	<li><a href ="video.jsp">Video</a></li>
	<li><a href ="aboutus.jsp">About Us</a></li>
	</ul>
	
	
	
	<form action="ProcessLogout" method = "post">
	<input  type="submit" value="Logout">
	</form>
	
	
</body>
</html>