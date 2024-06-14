package encapsulation.study;

public class Addition {
	private int number1;
	private int number2;
	
	
	public Addition() {}
	
	public Addition(int number1, int number2) {super();
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		if(number1>0) {
		this.number1 = number1;}
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		if(number2>0) {
		this.number2 = number2;}
	}
	
	public void addNumber() {
		if(number1>0 && number2>0) {
		int result=number1 + number2;
		System.out.println(result);}
		else {
			System.out.println("Either number1 or number2 or both number are Nagative");
		}
	}
	
	
	

	@Override
	public String toString() {
		return "Addition [number1=" + number1 + ", number2=" + number2 + "]";
	}
	
	

}
