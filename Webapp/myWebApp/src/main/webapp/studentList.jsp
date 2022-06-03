<%@page import="com.example.model.Student"%>
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

<h1><%=session.getAttribute("Role") %></h1>
	<table>
	<tr>
	<td>Id</td>
	<td>Name</td>
	<td>Email</td>
	<td>Action</td>
	
	</tr>
		<%
		ArrayList<Student> stList = (ArrayList<Student>)request.getAttribute("stList");
		for(Student st : stList){
			
			out.print("<tr><td>"+st.getId()+"</td><td> "+st.getfName()+""+st.getlName()+"</td><td>"+st.getEmail()+"</td></tr>");
		}
	%>
	</table>
	
	<%! int x = 9; %>
</body>
</html>