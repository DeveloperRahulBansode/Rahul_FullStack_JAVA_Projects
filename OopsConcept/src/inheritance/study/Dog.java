package inheritance.study;

public class Dog extends Animal {
	int legs;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(float height, String color, String noise,int legs) {
		//invoke parent class constructor using super keyword
		super(height, color, noise);
		this.legs=legs;
		
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Dog [legs=" + legs + ",Animal="+super.toString()+"]";
	}

	

	

}
