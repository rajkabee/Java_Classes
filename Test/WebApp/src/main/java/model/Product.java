package model;

public class Product {
	private int productId;
	private String name;
	private String description;
	private String brand;
	private float price;
	private boolean isInStock;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String name, String description, String brand, float price, boolean isInStock) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.isInStock = isInStock;
	}
	public Product(String name, String description, String brand, float price, boolean isInStock) {
		super();
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.isInStock = isInStock;
	}
	public Product(int productId, String name, String description) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isInStock() {
		return isInStock;
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", brand="
				+ brand + ", price=" + price + ", isInStock=" + isInStock + "]";
	}
	
	
	
}
