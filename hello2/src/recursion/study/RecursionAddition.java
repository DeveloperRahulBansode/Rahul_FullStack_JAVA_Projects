package recursion.study;

public class RecursionAddition {
	
	public int recursiveAdd(int number) {
		if(number==1) {
			return 1;}
			return 5+recursiveAdd(number-1);
	}
	
	public int factorial(int number) {
		if(number==1) {
			return 1;
		}
		return number*factorial(number-1);
	}

}
