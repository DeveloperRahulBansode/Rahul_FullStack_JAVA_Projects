package copyarray.study;

import java.util.Arrays;

public class CopySpacificElementInArray {
	
	
	public static void copySpacificElement(int[] srsArray,int startPosition,int endPosition) {
		
		int[] desArray=new int[(endPosition+1)-startPosition];
//		int j=0;
		for(int i=startPosition,j=0;i<=endPosition;i++,j++) {
			desArray[j]=srsArray[i];
		}
		for(int no:desArray) {
			System.out.println(no);
		}
		
		System.out.println(Arrays.toString(desArray));
	}
	

}
