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
public class ProductFormServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ProductForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product(
									request.getParameter("productName"),
									request.getParameter("manufacturer"),
									request.getParameter("dexcription"),
									Float.parseFloat(request.getParameter("price")),
									Boolean.parseBoolean(request.getParameter("isInStock"))
									);
		
		ProductDao productDao = new ProductDao();
		try {
			int i = productDao.save(product);
			if(i==1) {
				request.setAttribute("msg", "product added to the database");
				request.getRequestDispatcher("ProductForm.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "product failed to be added to the database");
				request.getRequestDispatcher("ProductForm.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
