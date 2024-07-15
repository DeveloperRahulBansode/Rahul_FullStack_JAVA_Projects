package sort.study;

public class BubbleSortString {
	 public static String[] sArray= {"Rahul","Pratik","Roshani","Pradnya"};

	// BUBBLE SORT USING THIRD VARIABLE

	public static void boubleSortString() {
		int size = sArray.length;

		System.out.println("Before Sort ");
		for (String name : sArray) {
			System.out.print(name + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {

				if (sArray[j].compareTo(sArray[j + 1])>0) {
					String temp = sArray[j];
					sArray[j] = sArray[j + 1];
					sArray[j + 1] = temp;
				}
//				System.out.println();
//				for (int z = 0; z < size; z++) {
//					System.out.print(sArray[z] + " ");
//				}
			}
		}
		System.out.println();
		System.out.println("After Sort ");
		for (String name : sArray) {
			System.out.print(name + " ");}
	}

}
