package polymorphism.study;

public class Product {

	private float price;
	private String brand;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(float price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String printProduct() {
		return "Price of Product ="+price + "Price of Product =" + brand; 
	}
	
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", brand=" + brand + "]";
	}
	
	

}
