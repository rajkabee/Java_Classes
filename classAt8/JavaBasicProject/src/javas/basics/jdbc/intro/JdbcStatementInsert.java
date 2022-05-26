package javas.basics.jdbc.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Product product = new Product("Gaming Mouse", "Dell", 
										"800dpi 6 utility buttons",
										1600f, true );
		String url = "jdbc:mysql://localhost:3306/itstore";
		String user = "root";
		String pass = "root";
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "INSERT INTO products (productName, brand, description, price, isInStock)"
						+ " values ('"
						+ product.getProductName()+"','"
						+ product.getBrand()+"','"
						+ product.getDescription()+"',"
						+ product.getPrice()+","
						+ product.isInStock()+")";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==1) {
			System.out.println("Product added to the database!");
		}
		
		con.close();
	}
}
/*
	private int productId;
	private String productName;
	private String brand;
	private String description;
	private float price;
	private boolean isInStock;

*/