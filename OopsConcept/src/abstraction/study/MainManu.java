package abstraction.study;

public class MainManu {
	public static void main(String[] args) {
		//Accessing super class method
		HotelManu vegmenu = new VegManu();
		//Accessing Subclass method which is Override
		vegmenu.displayManu();

		//Accessing super class method
		HotelManu nonvegmanu = new NonVegManu();
		//Accessing Subclass method which is Override
		nonvegmanu.displayManu();

	}

}
