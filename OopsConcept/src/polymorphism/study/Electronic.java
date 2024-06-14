package polymorphism.study;

public class Electronic extends Product {
	
	private boolean baterry;
	private boolean wireless;
	public Electronic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronic(float price, String brand ) {
		super(price, brand);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean getBaterry() {
		return baterry;
	}
	public void setBaterry(boolean baterry) {
		this.baterry = baterry;
	}
	public boolean getWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String printProduct() {
		
		return "Product Brand ="+getBrand()+"Product Price ="+getPrice()+
				"Product have Battery = "+baterry+"Product is Wireless ="+wireless;
	}
	

	@Override
	public String toString() {
		return "Electronic [baterry=" + baterry + ", wireless=" + wireless + ", toString()=" + super.toString() + "]";
	}
	 
}
