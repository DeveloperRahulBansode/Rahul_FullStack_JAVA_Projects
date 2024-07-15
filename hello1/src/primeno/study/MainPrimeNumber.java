package primeno.study;
import java.util.Scanner;

public class MainPrimeNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Range=");
		
		PrimeNumber.checkPrimeNumber(scanner.nextInt());
		
		scanner.close();
	}

}
