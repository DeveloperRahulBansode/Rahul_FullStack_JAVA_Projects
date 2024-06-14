package string.study;

import java.util.Scanner;

public class MainString {
	public static void main(String args[]) {
		
		// STRING TO CHARECTER ARRAY "tocharArray()"
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your String = ");
		 String data=scanner.next();
		StringCharacterCounter stringObj= new StringCharacterCounter(data);
	
		
		stringObj.vovelCounter();
		
		// REVERSE CHARECTORS OF STRING
		System.out.println("Enter Your String=");
		String value=scanner.next();
		ReverseString reverseobj=new ReverseString(value);
		reverseobj.reverseString();
		
		// STRING MATCH ARRAY "matches()"
		System.out.println("Enter Your Name = ");
		String data1=scanner.next();
		MatchesString matchobj=new MatchesString(data1);
		matchobj.matchString();
		
		// Split and Join 
		System.out.println("Enter Your String =");
		String data3=scanner.nextLine();
		SplitAndJoin splitjoinobj=new SplitAndJoin(data3);
		splitjoinobj.splitAndJoinString();
		
		//IDENTIFY THE STRING FROM GIVEN DATA
		System.out.println("Enter Your String =");
		String data4=scanner.nextLine();
		SplitAndJoin obj=new SplitAndJoin(data4);
		obj.ifChar();

		
		scanner.close();
		
	}

}
