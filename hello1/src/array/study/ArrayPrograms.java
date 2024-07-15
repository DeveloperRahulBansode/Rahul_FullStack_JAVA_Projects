package array.study;

public class ArrayPrograms {

	public static int[] intArray = { 40, 30, 10, 50 };
	
	// Greater number in Array Element
	public static void greterNumberInArray() {
		int temp = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (temp < intArray[i]) {
				temp = intArray[i];
			}
		}
		System.out.println("Greter Number" + "Among array element is= " + temp);
	}

	// Smaller number in Array Element
	public static void smallerNumberInArray() {
		int temp = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (temp > intArray[i]) {
				temp = intArray[i];

			}
		}
		System.out.println("Smaller Number" + "Among array element is= " + temp);
	}

	// Sumation of Array Element
	public static void sumation() {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i];
		}
		System.out.println("Sumetion of " + "Array Element is= " + sum);
	}

	// Dividation of Array Element
	public static void dividation() {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i];
		}
		System.out.println("Dividation of " + "Array Element is= " + sum / intArray.length);
	}

	// Left Rotate Array Element
	public static void leftRotate() {
		int firstElement = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(" Befor Left Roteted Element is=" + intArray[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < intArray.length - 1; i++) {
			intArray[i] = intArray[i + 1];
		}
		intArray[intArray.length - 1] = firstElement;
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("After Rotete Left Element is=" + intArray[i] + " ");
		}
	}
	
	// Right Rotate Array Element
	public static void rightRotete() {
		int lastElement = intArray[intArray.length - 1];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(" Befor Right Roteted Element is=" + intArray[i] + " ");
		}
		System.out.println();
		for (int i = intArray.length - 1; i > 0; i--) {
			intArray[i] = intArray[i - 1];
		}
		intArray[0] = lastElement;
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("After Rotete Right Element is=" + intArray[i] + " ");
		}

	}
}