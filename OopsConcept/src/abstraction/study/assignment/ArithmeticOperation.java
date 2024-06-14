package abstraction.study.assignment;

public abstract class ArithmeticOperation {
	private int number;

	public ArithmeticOperation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArithmeticOperation(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public abstract int operation(int num1,int num2);
	
	@Override
	public String toString() {
		return "ArithmeticOperation [number=" + number + "]";
	}
	

}
