<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="menu.jsp" %>
<h1>
Salut </h1>
<% 
 String variable = (String) request.getAttribute("variable");
 out.println(variable);
%>

<h1>
BONJOUR  <% 
 String name = (String) request.getAttribute("name");
 out.println(name);
%>
Comment tu vas ? </h1>


</body>
</html>