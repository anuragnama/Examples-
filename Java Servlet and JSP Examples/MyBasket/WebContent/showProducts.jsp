<%@page import="java.util.List"%>
<%@page import="com.github.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Product List

<%
List<Product>plist=(List<Product>)request.getAttribute("products");
for(Product p:plist){
	out.println(p.getPid()+":"+ p.getPname()+":"+ + p.getPrice()+":"+ p.getCategory()+":"+p.getStock());
	out.print("<br>");
}
%>


</body>
</html>