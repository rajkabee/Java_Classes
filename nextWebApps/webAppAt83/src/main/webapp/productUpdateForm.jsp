<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h1>Product Update Form</h1>
	<form action="/webAppAt83/updateProduct" method="POST">
	<input type="hidden" name = "id" value = ${product.productId }>
    <label for="productName">Product Name: </label>
    <input type="text" name="productName" value = ${product.name}><br>
    <label for="brand">Manufacturer: </label>
    <input type="text" name="brand" value=${product.brand }><br>
    <label for="description">Product Description: </label>
    <input type="textarea" name="description" value = '${product.description}' rows="3" cols="50"><br>
    <label for="price">Price: </label>
    <input type="number" name="price" value = ${product.price }><br>
    <label for="isInStock">Is in stock: </label>
    <input type="radio" name="isInStock" value="true" 
    	<% Product p = (Product)request.getAttribute("product");  	
    	if(p.isInStock()){
    		out.write("checked");
    	}
    	%>><label for="true" >Yes</label>
    
    <input type="radio" name="isInStock" value="false" 
    <%   	
    	if(!p.isInStock()){
    		out.write("checked");
    	}
    	
    	%>><label for="false" >No</label><br>
    <input type="submit" value="Update Product">
</form>
</body>
</html>