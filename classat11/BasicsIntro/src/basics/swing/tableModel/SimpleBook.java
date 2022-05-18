package basics.swing.tableModel;

public class SimpleBook {
	   private String title;
	   private String author;
	   private double price;
	   public SimpleBook(String t, String a, double pr) {
	      title = t.trim();
	      author = a.trim();
	      price = pr;
	   }
	   public String getTitle() {
	      return title;
	   }
	   public String getAuthor() {
	      return author;
	   }
	   public double getPrice() {
	      return price;
	   }
	}