package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import model.ProductDao;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("productForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product(
							request.getParameter("productName"),
							request.getParameter("brand"),
							request.getParameter("description"),
							Float.parseFloat(request.getParameter("price")),
							Boolean.parseBoolean(request.getParameter("isInStock")) 		
				);
		
		ProductDao pDao = new ProductDao();
		int i =0;
		try {
			i= pDao.save(product);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==1) {
			request.setAttribute("msg", "Product added Successfully!");
			response.getWriter().write("Product added Successfully!");
		}
		else {
			request.setAttribute("msg", "Product added Successfully!");
			response.getWriter().write("Product couldnot be added!");
		}
	}

}
