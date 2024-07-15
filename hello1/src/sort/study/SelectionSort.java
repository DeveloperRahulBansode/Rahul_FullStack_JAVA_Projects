package sort.study;

public class SelectionSort {
	public static int[] intArray = { 4, 3, 5, 1, 2 };  

	public static void selectionSort() {
		int size = intArray.length;
		int key;

		System.out.println("Before Sort ");
		for (int no : intArray) {
			System.out.print(no + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			key = i;
			for (int j = i + 1; j < size; j++) 
				if (intArray[key] > intArray[j]) {
					key = j;}
			
			//USING THIRD VARIABLE
//			int temp = intArray[i];
//			intArray[i] = intArray[key];
//			intArray[key] = temp;
			
			//WITHOUT USING THIRD VARIABLE
			if(key!=i) {
			intArray[key]=intArray[key]+intArray[i];
			intArray[i]=intArray[key]-intArray[i];
			intArray[key]=intArray[key]-intArray[i];}
		}
		System.out.println();
		System.out.println("After Sort ");
		for (int no : intArray) {
			System.out.print(no + " ");
		}

	}
}
