package sort.study;

public class BubbleSort {

	public static int[] intArray = { 5, 6, 3, 2, 9, 1 };

	// BUBBLE SORT USING THIRD VARIABLE

	public static void boubleSort() {
		int size = intArray.length;

		System.out.println("Before Sort ");
		for (int no : intArray) {
			System.out.print(no + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {

				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
				System.out.println();
				for (int z = 0; z < size; z++) {
					System.out.print(intArray[z] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("After Sort ");
		for (int no : intArray)
			System.out.print(no + " ");
	}

}
