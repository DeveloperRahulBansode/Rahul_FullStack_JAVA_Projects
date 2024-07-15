package searching.study;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearchElement(int element, int intArray[]) {
		Arrays.sort(intArray);
		int left = 0;
		int right = intArray.length - 1;
		int mid=0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (element > intArray[mid]) {
				left = mid + 1;
			} else if (element == intArray[mid]) {
				break;
			} else {
				right = mid - 1;
			}

		}
		
		if (left > right) {
			return -1;
		}
		
		return mid;
		

	}

}
