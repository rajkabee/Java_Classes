package javas.basics.jdbc.intro.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcApp {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String ch;
		int i;
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		ProductDao pDao = new ProductDao();
		do {
			do {
				System.out.println("Enter your choice: \n"
									+ "a. add a new product\n"
									+ "b. view a product's details\n"
									+ "c. view all products details\n"
									+ "d. update a product's detail\n"
									+ "e. delete a product's details\n"
									+ "\t:-");
				ch = sc.nextLine();
			}while(!(ch.equalsIgnoreCase("a")
					||ch.equalsIgnoreCase("b")
					||ch.equalsIgnoreCase("c")
					||ch.equalsIgnoreCase("d")
					||ch.equalsIgnoreCase("e")
					));
			if(ch.equalsIgnoreCase("a")) {
				Product p = new Product();
				System.out.println("Enter the new product's Details: ");
				System.out.println("Product Name: ");
				String name = sc.nextLine();
				p.setProductName(name);
				System.out.println("Brand: ");
				p.setBrand(sc.nextLine());
				System.out.println("Description: ");
				p.setDescription(sc.nextLine());
				System.out.println("Price: ");
				p.setPrice(sc.nextFloat());
				System.out.println("Is Available(y/n)?");
				if(sc.next().equalsIgnoreCase("y")) {
					p.setInStock(true);
				}
				else {
					p.setInStock(false);
				}
				i = pDao.save(p);
				if(i==1) {
					System.out.println("Product saved to the database!");
				}
			}
			
			else if(ch.equalsIgnoreCase("b")) {
				System.out.println("Enter the id of the product: ");
				Product p = pDao.getOne(sc.nextInt());
				System.out.println(p);
			}
			
			else if(ch.equalsIgnoreCase("c")) {
				System.out.println("Details of all the products: ");
				ArrayList<Product> products = pDao.getAll();
				for(Product p :products) {
					System.out.println(p);
				}
			}
			
			else if(ch.equalsIgnoreCase("d")) {
				Product p = new Product();
				System.out.println("Enter product's Details to be updated: ");
				System.out.println("Product ID: ");
				p.setProductId(Integer.parseInt(sc.nextLine()));
				System.out.println("Product Name: ");
				String name = sc.nextLine();
				p.setProductName(name);
				System.out.println("Brand: ");
				p.setBrand(sc.nextLine());
				System.out.println("Description: ");
				p.setDescription(sc.nextLine());
				System.out.println("Price: ");
				p.setPrice(sc.nextFloat());
				System.out.println("Is Available(y/n)?");
				if(sc.next().equalsIgnoreCase("y")) {
					p.setInStock(true);
				}
				else {
					p.setInStock(false);
				}
				i = pDao.update(p);
				if(i==1) {
					System.out.println("product updated in the database!");
				}
			}
			/*
			else if(ch.equalsIgnoreCase("e")) {
				System.out.println("Enter the id of the student to be deleted: ");
				int id = sc.nextInt();
				Student st = sDao.getOne(id);
				System.out.println(st);
				do {
					System.out.println("Confirm Delete(y/n):");
					ch = sc.next();
				}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
				if(ch.equalsIgnoreCase("y")){
					i = sDao.delete(id);
					if(i==1) {
						System.out.println("Student deleted form the database.");
					}
				}
				
			}
			*/
			
			
			
			
			do {
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.next();
			}while(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n")));
		}while(ch.equalsIgnoreCase("y"));
	}
}
