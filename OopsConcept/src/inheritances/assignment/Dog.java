package inheritances.assignment;

public class Dog extends Animal {

	private int legs;
	private String gender;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(float height, String color, String noise, String hair, int legs, String gender) {
		super(height, color, noise, hair);
		this.legs=legs;
		this.gender = gender;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Dog [legs=" + legs + ", gender=" + gender + " toString()="
				+ super.toString()+ "]";
	}

	
	
	

}
