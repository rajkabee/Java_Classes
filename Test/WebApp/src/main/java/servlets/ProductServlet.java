package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		//response.getWriter().write("Product Id: "+id);
		Product product = new Product(id, "Laptop", 
			"intel 12th gen cpu, 16gb ram, 4gb nvidia graphice, 512gb ssd nvme"
			);
		request.setAttribute("product", product);
		//System.out.println();
		request.getRequestDispatcher("ProductDetails.jsp").forward(request, response);
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public class Product{
		int id;
		String name;
		String description;
		public Product(int id, String name, String description) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}
		
	}
}
