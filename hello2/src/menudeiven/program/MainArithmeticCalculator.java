package menudeiven.program;

import java.util.Scanner;

public class MainArithmeticCalculator {
	public static void main(String args[]) {
		
		ArithmetiCalculator calculate=new ArithmetiCalculator();
		calculate.setOperand1(5);
		calculate.setOperand2(10);
				Scanner scanner=new Scanner(System.in);
				
				int choice;
				do {
					choice=calculate.printMenu(scanner);
					switch(choice){
						case 1 : System.out.println(calculate.addOperand());
							break;
						case 2 : System.out.println(calculate.subOperand());
							break;
						case 3 : System.out.println(calculate.mulOperand());
							break;
						case 4 : System.out.println(calculate.divOperaand());
							break;
						case 5 : System.out.println(calculate.modOperand());
							break;
						case 6 : System.out.println("BYE");
						break;
						default : System.out.println("Invalid Choice");
									}	
					
					}while(choice!=6);

		
		scanner.close();
		
		
	}

	
}
