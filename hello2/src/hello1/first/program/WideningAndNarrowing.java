package hello1.first.program;

public class WideningAndNarrowing {
	
	public static void main(String arge[]) {
		
	// widening 
		
		byte bytevariable=100;  //8 bit data
		short shortvariable=bytevariable; //8 bit store in short 16 bit size
		
		int intvariable=bytevariable;  //8 bit byte data store in 32 bit int size
		int intvariable1=shortvariable;  // 16 bit data store in 32 bit int size
		
		long longvariable=bytevariable;  //8 bit data store in 64 bit long size
		long longvariable1=shortvariable;  // 16 bit data store in 64 bit long size
		long longvariable2=intvariable;    //
		
		float floatvariable=intvariable;
		float floatvariablel1=longvariable;
		
		
		
		
		
		
		
		
		
		
	}

	

}
