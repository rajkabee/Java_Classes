package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class MyServlet extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		//response.getWriter().append("<h1>Welcome, "+fName+" "+lName+" "+email+"!</h1>");
		request.setAttribute("firstName", fName);
		request.setAttribute("lastName", lName);
		request.setAttribute("email", email);
		request.getRequestDispatcher("welcomePage.jsp").forward(request, response);
	}




}
