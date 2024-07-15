package sort.study;

public class InsertionSort {

	public static int[] intArray = { 5, 4, 3, 2, 1 };

	public static void insertionSort() {
		System.out.println("Before Sort ");
		for (int no : intArray) {
			System.out.print(no + " ");
		}
		int j = 0;
		int temp = 0;
		int key = 0;
		for (int i = 1; i < intArray.length; i++) {
			j = i - 1;
			key = j;

			while (j >= 0 && intArray[key] > intArray[j + 1]) {
				temp = intArray[key];
				intArray[j] = intArray[j + 1];
				intArray[j + 1] = temp;
				j--;
				key--;
			}
			
		}
		System.out.println();
		System.out.println("After Sort ");
		for (int no : intArray) {
			System.out.print(no + " ");}

	}

}
