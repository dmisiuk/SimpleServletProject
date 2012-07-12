<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test JSP page</title>
</head>
<body>
<h1>The test jsp page</h1>

<%!
public int sum(int a, int b ){
	return a + b;
	
}
%>

<%
int a = 12342;
int b = 12341;

int k = sum(a, b);

%>

<i>The value of a  is <%=a %></i><br>
<i>The value of b  is <%=b %></i> <br>
<i>The value of a + b is <%=k %></i>


</body>
</html>