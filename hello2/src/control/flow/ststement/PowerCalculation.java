package control.flow.ststement;


public class PowerCalculation {
	
	private int base;
	private int exponent;
	
	
	public PowerCalculation() {}
	
	public PowerCalculation(int base,int exponent) {
		this.base=base;
		this.exponent=exponent;
		
	}
	
	public void setdata1(int base) {
		this.base=base;	
	}
	public int getdata1() {
		return base;
	}
	
	public void setdata2(int exponent) {
		this.exponent=exponent;	
	}
	public int getdata2() {
		return exponent;
	}
	
	public int power() {
		int i=1;
		int result=1;
		while(i<=exponent) {
			result=base*result;
			i++;
		}
		return result;
		
	}
	

}
