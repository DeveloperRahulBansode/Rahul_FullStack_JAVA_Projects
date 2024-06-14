package polymorphism.study;

public class Foods extends Product {
	
	private String expiryDate;
	private boolean veg;
	public Foods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Foods(String expiryDate, boolean veg) {
		super();
		this.expiryDate = expiryDate;
		this.veg = veg;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	
	@Override
	public String printProduct() {
		
		return "Product Brand ="+getBrand()+"Product Price ="+getPrice()+
				"Product ExpiryDate = "+expiryDate+"Product is for Vegitariance ="+veg;
	}
	@Override
	public String toString() {
		return "Foods [expiryDate=" + expiryDate + ", veg=" + veg + ", toString()=" + super.toString() + "]";
	}
	
	

}
