package searching.study;

public class MainSearching {
	public static void main(String[] args) {
		
		int[] intArray= {90,80,10,50,70};
		int index=BinarySearch.binarySearchElement(80,intArray);
		if(index>=0) 
			System.out.println("Element Found At Index: "+index);
			else
			System.out.println("Element Not Found.");
	}

}
