package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProductDao;

import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id = Integer.parseInt( request.getParameter("id"));
		ProductDao dao = new ProductDao();
		int i=0;
		String msg = "Detete Failed";
		try {
			i = dao.delete(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==1) {
			msg = "Product Deleted";
		}
		//response.getWriter().write(msg);
		request.setAttribute("msg", msg);
		response.sendRedirect("/webAppAt82/products");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
