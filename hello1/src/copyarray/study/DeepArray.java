package copyarray.study;

public class DeepArray {
	public static int[] srsArray = { 1, 2, 3 };
	public static int[] desArray = new int[5];
	
	public static void deepcopyExample() {
		for (int i = 0; i < desArray.length; i++) {
			if (i < srsArray.length) {
				desArray[i] = srsArray[i];
			} else {
				desArray[i] = 0;
			}
		}
		for (int number : desArray) {
			System.out.print(number+" ");
		}
	}
}

