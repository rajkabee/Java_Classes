package com.example;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.Student;

@WebServlet("/ListToJsp")
public class ListToJsp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(new Student(1, "Ram", "Thapa", "ramthapa@gmail.com"));
		stList.add(new Student(2, "Gangalal", "Shrestha", "gangalal@gmail.com"));
		stList.add(new Student(3, "Bhakti", "Thapa", "bhaktit;hapa@gmail.com"));
		request.setAttribute("stList", stList);
		HttpSession session = request.getSession();
		session.setAttribute("Role", "Admin");
		session.setMaxInactiveInterval(30);
		Cookie cookie = new Cookie("Username", "Sagar");
		cookie.setMaxAge(10);
		response.addCookie(cookie);
		request.getRequestDispatcher("studentList.jsp").forward(request, response);
	}



}
