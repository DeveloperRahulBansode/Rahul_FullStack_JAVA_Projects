
package polymorphism.study;

public class MainProducts {
	public static void main(String[] args) {
		
		Product p=new Product();
	
		Electronic e=new Electronic();
		e.setBrand("I Phone");
		e.setPrice(10000);
		e.setBaterry(false);
		e.setWireless(true);
		
		//
		Foods f=new Foods();
		f.setBrand("Gokul");
		f.setPrice(50F);
		f.setExpiryDate("05/06/2024");
		f.setVeg(true);
		
		
		// Polymorphisum
		
		//Up casting(Subclass to Superclass)
		p=e;
		System.out.println(p.printProduct());
		
		p=f;
		System.out.println(p.printProduct());

		
		
		
		
		
		
	}

}
