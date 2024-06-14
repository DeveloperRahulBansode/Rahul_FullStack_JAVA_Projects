package statementcalling;

import controlstatement.study.ConditionalStatements;

public class MainControlStatements {
	public static void main(String args[]) {
		
		int variable1=10;
		int variable2=20;
		int variable3=30;
		
		// IF statement
		ConditionalStatements statements=new ConditionalStatements(variable1==variable2);
		statements.testIF();
		
		// IF Else statement
		ConditionalStatements statements1=new ConditionalStatements((variable1 < variable2) && (variable1 < variable3));
		statements1.testIF();
		
		//IF Else Ladder
		
		ConditionalStatements statements2=new ConditionalStatements();
		
		char value=statements2.testElseIfLadder(65);
		System.out.println("Grade is = "+value);
		
		//Switch case
		statements2.testSwitch(value);
		
		
		//Nested IF
		statements2.testNestedif(10, 20, 30);
		
		
		
		
		

		
		
		
	}

}
