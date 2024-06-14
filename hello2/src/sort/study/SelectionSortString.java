package sort.study;

public class SelectionSortString {
	 public static String[] sArray= {"Rahul","Pratik","Pranav","Sonal"};
		
	public static void selectionSortString() {
		int size = sArray.length;
		int key;
		System.err.println();
		System.out.println("Before Sort ");
		for (String name : sArray) {
			System.out.print(name + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			key = i;
			for (int j = i + 1; j < size; j++) 
				if (sArray[key].compareTo(sArray[j])>0) {
					key = j;}
			
			//USING THIRD VARIABLE
			 String temp = sArray[i];
			sArray[i] = sArray[key];
			sArray[key] = temp;
			
			//WITHOUT USING THIRD VARIABLE
//			if(key!=i) {
//			sArray[key]=sArray[key]+sArray[i];
//			sArray[i]=sArray[key]-sArray[i];
//			sArray[key]=sArray[key]-sArray[i];}
	}
		System.out.println();
		System.out.println("After Sort ");
		for (String name : sArray) {
			System.out.print(name + " ");}

	}

}
