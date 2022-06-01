package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import model.ProductDao;


@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ProductForm.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		//response.getWriter().write(""+request.getParameter("productName"));
		Product product  = new Product(
								request.getParameter("productName"),
								request.getParameter("description"),
								request.getParameter("brand"),
								Float.parseFloat(request.getParameter("price")),
								Boolean.parseBoolean(""+request.getParameter("isInStock"))
								);
		ProductDao pDao = new ProductDao();
		try {
			int i = pDao.save(product);
			if(i==1) {
				response.getWriter().write("Product added successfully");
			}
			else {
				response.getWriter().write("Failed");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
