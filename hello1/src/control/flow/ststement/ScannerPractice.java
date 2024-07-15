package control.flow.ststement;
import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		int variable;
		//integer
		System.out.println("Enter Integer value=");
		variable=scanner.nextInt();
		System.out.println("Your Int value is="+variable);
		//Byte
		System.out.println("Enter Byte value=");
		variable=scanner.nextByte();
		System.out.println("Your Byte value is=");
		//Short
		System.out.println("Enter Short value=");
		variable=scanner.nextShort();
		System.out.println("Your Byte value is=");
		//Long
		System.out.println("Enter Long value=");
		variable=(int) scanner.nextLong();
		System.out.println("Your Long value is=");
		//
		System.out.println("enter Pincone");
		variable=scanner.nextInt();
		System.out.println(+variable);
		
		String address;
		scanner.nextLine();
		System.out.println("Enter address");
		address=scanner.nextLine();	
		System.out.println(address);
		
		scanner.close();
	}

}
