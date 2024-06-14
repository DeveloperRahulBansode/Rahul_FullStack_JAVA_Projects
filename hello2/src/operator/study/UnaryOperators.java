package operator.study;

public class UnaryOperators {
	private int variable3;
	
	
	public UnaryOperators() {}
	
	public UnaryOperators(int variable3) {
		this.variable3=variable3;
	}
	
	public void setVariable3(int variable3) {
		this.variable3=variable3;
		
	}
	
	public int getVariable3() {
		return variable3;
	}
	
	public int preIncrementOnVariable3() {
		return ++variable3;
	}
	
	public int postIncreamentOnVariable3() {
		return variable3++;
	}
	
	public int preDecrementOnVariable3() {
		return --variable3;
	}
	
	public int postDecrementVariable3() {
		return variable3--;
	}
	
	
	
	
	
	

}
