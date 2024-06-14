package sort.study;

public class InsertionSortString {
	 public static String[] sArray= {"Rahul","Dipali","Rupali","Sonali"};
	
	 public static void insertionSortString() {
		 System.out.println();
		 System.out.println("Before Sort ");
			for (String name : sArray) {
				System.out.print(name + " ");
			}
			int j=0;
			int key=0;
			String temp;
			
			for(int i=1;i<sArray.length;i++) {
				j=i-1;
				key=j;
				while(j>=0 && sArray[key].compareTo(sArray[j+1])>0) {
					temp=sArray[key];
					sArray[j]=sArray[j+1];
					sArray[j+1]=temp;
					j--;
					key--;
				}
				
			}
			System.out.println();
			System.out.println("After Sort ");
			for (String name : sArray) {
				System.out.print(name + " ");
			}
		 
	 }

}
