package controlstatement.study;

public class ConditionalStatements {
	private boolean expression;
	
	public ConditionalStatements() {}
	
	public ConditionalStatements(boolean expression) {
		
		this.expression=expression;
	}
	
	public void setExpression(boolean expression) {
		this.expression=expression;
	}
	
	public boolean getExpression() {
		return expression;
	}
	
	public void testIF() {
		if(expression) {
			System.out.println("IF True block");
		}
		else {
			System.out.println("IF False block");
		}
	}
	
	public char testElseIfLadder(int marks) {
		if(marks>=90) {
			return 'A';
		}
		else if(marks>=80) {
			return 'B';
		}
		else if(marks>=70) {
			return 'C';
		}
		else if(marks>=60) {
			return 'D';
		}
		else if(marks>=50) {
			return 'E';
		}
		else
			return 'F';
		}
	
	public void testSwitch(char grades) {
		switch (grades) {
		case 'A': System.out.println("A grade passs with above 90");
		break;
		case 'B': System.out.println("B grade pass with above 80");
		break;
		case 'C': System.out.println("C grade pass with above 70");
		break;
		case 'D': System.out.println("D grade pass with above 60");
		break;
		case 'E': System.out.println("E grade pass with above 50");
		break;
		default: System.out.println("Less Than 50");
		}	
	}
	
	
	public void testNestedif(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println("Number1="+num1+" is GRATER");
		}
		if(num2>num1 && num2>num3) {
			System.out.println("NUmber2="+num2+" is GRATER");
		}
		if(num3>num1 && num3>num2) {
			System.out.println("NUmber3="+num3+" is GRATER");
		}
		
		
	}
	
	
	
}
