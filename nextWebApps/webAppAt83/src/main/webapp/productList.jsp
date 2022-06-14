<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getAttribute("msg")!=null?request.getAttribute("msg"):"" %>
${msg}
	<h1>PRODUCTS</h1>
	<!-- 
	<table>
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Manufacturer</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<%	ArrayList<Product> products =(ArrayList<Product>) request.getAttribute("products");
			for(Product p: products){
				out.write("<tr><td>"+p.getProductId()+"</td><td>"+p.getName()+"</td><td>"+p.getBrand());
				out.write("</td><td>"+p.getPrice()+"</td><td></td></tr>");
			}
		%>
		
	</table>
	 -->
	<c:forEach var="tempCity" items="${myCities}">
${tempCity} <br/>
</c:forEach>

	<table>
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Manufacturer</th>
			<th>Description</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.productId }</td>
				<td>${product.name }</td>
				<td>${product.brand }</td>
				<td>${product.description}</td>
				<td>${product.price }</td>
				<td>
					<a href="/webAppAt83/deleteProduct?id=${product.productId}"><button>Delete</button></a>
					<a href="/webAppAt83/updateProduct?id=${product.productId}"><button>Update</button></a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>