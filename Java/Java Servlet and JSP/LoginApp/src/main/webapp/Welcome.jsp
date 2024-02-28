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

if (session.getAttribute("uname")==null){
	
	response.sendRedirect("LoginPage.html");
}

%>


<h1>
Welcome ${uname} !!!! You have been Succcessfull verified

</h1>

<br>
<br>
<br>

<h2>
Want to see something more -> <a href="Product.jsp">click here</a> ;)
</h2>

</body>
</html>