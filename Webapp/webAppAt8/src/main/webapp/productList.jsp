<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Products</h1>
<a href="/webAppAt8/addProduct"><button>Add Product</button></a>
<table>
	<tr>
		<th>Id</th>
		<th>Product Name</th>
		<th>Manufacturer</th>
		<th>Description</th>
		<th>Price</th>
		<th>Is Available</th>
		<th>Action</th>
	</tr>
	<% 
	ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
	for(Product p:products){
		out.print("<tr><td>"+p.getProductId()+"</td><td>"+p.getProductName()+"</td><td>"+p.getBrand()+"</td><td>"+p.getDescription());
		out.print("</td><td>"+p.getPrice()+"</td><td>"+p.isInStock()+"</td>");
		out.print("<td><a href='/webAppAt8/updateProduct?id="+p.getProductId()+"'><button>Update</button></a><td></tr>");
	}
	
	%>
</table>
</body>
</html>