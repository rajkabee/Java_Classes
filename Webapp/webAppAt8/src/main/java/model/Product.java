package model;

public class Product {
	private int productId;
	private String productName;
	private String brand;
	private String description;
	private float price;
	private boolean isInStock;
	public Product() {
		super();
	}
	public Product(int productId, String productName, String brand, String description, float price,
			boolean isInStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.isInStock = isInStock;
	}
	public Product(String productName, String brand, String description, float price, boolean isInStock) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.isInStock = isInStock;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand
				+ ", description=" + description + ", price=" + price + ", isInStock=" + isInStock + "]";
	}
	
	
	
	
	
}
