<%@page import="com.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fetching from database</title>
</head>
<body bgcolor="cyan">
   <%
       Alien a1= (Alien)session.getAttribute("alien");  // if we use requestdispatcher then we have to use request here
       out.println(a1);
   %>
</body>
</html>