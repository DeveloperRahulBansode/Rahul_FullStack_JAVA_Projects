package functional.interfaces.assignment2;

public class MainTypeOfNumber {

	public static void main(String[] args) {
		TypeOfNumber primeNo = no -> {
			boolean isPrime = true;
			for (int i = 2; i <= no / 2; i++) {
				if (no % i == 0) {
					System.out.println(no + " is not prime number");
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(no + " is prime number");
			}
			return false;
		};

		TypeOfNumber armstrong = no -> {
			int temp = no;
			int sum = 0;
			while (no != 0) {
				sum = sum + (int) Math.pow(no % 10, 3);
				no = no / 10;
			}
			if (sum == temp) {
				System.out.println(temp + " " + "NUmber is Armstrong");
			} else {
				System.out.println(temp + " " + "Number is NOT Armstrong");
			}
			return false;
		};

		TypeOfNumber palyndrom = no -> {
			int sum = 0;
			int temp = no;
			while (no != 0) {
				sum = sum * 10 + (no % 10);
				no = no / 10;
			}
			if (temp == sum) {
				System.out.println(temp + " " + "number is palendrom");
			} else {
				System.out.println(temp + " " + "number is not palendrom");
			}
			return false;

		};

		System.out.println(primeNo.checkNo(10));
		System.out.println(armstrong.checkNo(371));
		System.out.println(palyndrom.checkNo(16461));

	}

}
