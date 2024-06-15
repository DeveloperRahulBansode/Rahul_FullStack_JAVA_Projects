package functional.interfaces.assignment2;

public class CalculateNo {
	public static boolean isPrime = true;

	public static void checkPrimeNumber(int range) {
		for (int j = 2; j <= range; j++) {
			isPrime = true;
			for (int i = 2; (i * i) <= j; i++) {
				if (j % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Prime number is=" + j);
			}

		}

	}
}
