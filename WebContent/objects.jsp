<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objects</title>
</head>
<body>

<%
String userName = request.getParameter("name");
if(userName != null && userName != ""){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
}
%>

Request: Your name is <b><%= userName %></b><br/>
Session: Your name is <b><%= session.getAttribute("sessionUserName") %></b><br/>
Application: Your name is <b><%= application.getAttribute("applicationUserName") %></b><br/>

</body>
</html>