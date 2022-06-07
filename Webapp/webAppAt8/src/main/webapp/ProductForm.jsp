<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Form</title>
</head>
<body>
${msg}
<%=request.getAttribute("msg") %>
<%!int price =2000; %>
<%=price %>
 <h1>Product Form</h1>
    <form action="/webAppAt8/addProduct" method= "POST">
    <label for="productName">Product Name: </label>
    <input type="text" name="productName" >
    <br>
    <label for="manufacturer">Manufacturer: </label>
    <input type="text" name="manufacturer">
    <br>
    <label for="description">Product Description: </label>
    <textarea name="description" id="" cols="50" rows="4"></textarea>
    <br>
    <label for="price">Price: </label>
    <input type="number" step="0.01" name="price">
    <br>
    <label for="isInStock">Is Available: </label>
    <input type="radio" name="isInStock" value="true"><span>Yes</span>
    <input type="radio" name="isInStock" value="false"><span>No</span>

    <br>
    <input type="submit" value="Submit">
    </form>
</body>
</html>