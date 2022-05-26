package javas.basics.jdbc.intro;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPreparedStatementInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Product product = new Product("Mechanical Keyboard", "Dell", 
										"RGB backlit Keyboard",
										3500f, true );
		String url = "jdbc:mysql://localhost:3306/itstore";
		String user = "root";
		String pass = "root";
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "INSERT INTO products (productName, brand, description, price, isInStock)"
						+ " values (?,?,?,?,?)";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, product.getProductName());
		pstm.setString(2, product.getBrand());
		pstm.setString(3, product.getDescription());
		pstm.setFloat(4, product.getPrice());
		pstm.setBoolean(5, product.isInStock());
		
		int i = pstm.executeUpdate();
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
