package operator.study;

public class LogicalOperators {

	char operand1;
	char operand2;
	int operand3;
	int operand4;
	
	public LogicalOperators() {}
	
	public LogicalOperators(char operand1,char operand2,int operand3,int operand4) {
		
		this.operand1=operand1;
		this.operand2=operand2;
		this.operand3=operand3;
		this.operand4=operand4;
		
		
		
	}
	
	public void setOperand1(char operand1) {
	this.operand1=operand1; 	
	}
	
	public char getOperand1() {
		return operand1;
	}
	
	public void setOperand2(char operand2) {
		this.operand2=operand2; 	
		}
		
		public char getOperand2() {
			return operand2;
		}
		
		public void setOperand3(int operand3) {
			this.operand3=operand3; 	
			}
			
			public int getOperand3() {
				return operand3;
			}
			
			public void setOperand4(int operand4) {
				this.operand4=operand4; 	
				}
				
				public int getOperand4() {
					return operand4;
				}
			
	
	public boolean lessThanOnOperand() {
		return operand1<operand2;
		
	}
	
	
	public boolean greaterThanOnOperand() {
		return operand1>operand2;
		
	}
	
	public boolean lessThanEqualtoOnOperand() {
		return operand1<=operand2;
		
	}
	
	public boolean graterThanEqualtoOnOperand() {
		return operand1>=operand2;
		
	}
	
	public boolean equalToOnOperand() {
		return operand1==operand2;
	}
	
	public boolean notEqualToOnOperand() {
		return operand1!=operand2;
	}
	
	//NOT
	public boolean notonOperand() {
		return !(operand3<operand4);
	}
	//AND
	public boolean andOnOperand() {
		return (operand3<operand4)&&(operand4>operand3);
	}
	// OR
	public boolean orOnOperand() {
		return (operand3>operand4)||(operand4<operand3);
		
	}
	
	
	

	
	
	
	
	
	
	
	
}


