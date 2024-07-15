package operator.study;

public class SwapTwoNumbers {
	private int number1;
	private int number2;
	
	public SwapTwoNumbers() {}
	
	public SwapTwoNumbers(int number1,int number2) {
		this.number1=number1;
		this.number2=number2;	
	}
	
	public void setNUmber1(int number1) {
		this.number1=number1;
	}
	
	public int getNumber1() {
		return number1;
	}
	public void setNUmber2(int number2) {
		this.number2=number2;
	}
	
	public int getNumber2() {
		return number2;
	}
	
	public void swapUsingThreeVariable() {
		int temp=number1;
		number1=number2;
		number2=temp;
	
	}
	
	
	public void swapWithoutUsingThreeVariable() {
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		
	}
	
	public void beforeSwap() {
		System.out.println("Number1=" + number1);
		System.out.println("Number2=" +number2);
	}
	
	public void afterSwap() {
		System.out.println("Number1="+number1);
		System.out.println("Number2="+number2);
	}
	
	
	

}
