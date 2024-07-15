package string.study;

public class StringCharacterCounter {
	
	private String name;
	
	public StringCharacterCounter() {}
	
	public StringCharacterCounter(String name) {
		this.name=name;
		
	}
	
	public void vovelCounter() {
		
        int counterA=0;
		int counterE=0;
		int counterI=0;
		int counterO=0;
		int counterU=0;
		int counterConsonent=0;
		
		
		char[] nameArray=name.toCharArray();
		
		for(int i=0;i<nameArray.length;i++) {
			switch(nameArray[i]) {
			case 'A' -> counterA++;
			case 'a' -> counterA++;
			
			case 'E' -> counterE++;
			case 'e' -> counterE++;
			
			case 'I' -> counterI++;
			case 'i' -> counterI++;
			
			case 'O' -> counterO++;
			case 'o' -> counterO++;
			
			case 'U' -> counterU++;
			case 'u' -> counterU++;
			
			default -> counterConsonent++;
			}
			
				
		}
		System.out.println("A:"+counterA);
		System.out.println("E:"+counterE);
		System.out.println("I:"+counterI);
		System.out.println("O:"+counterO);
		System.out.println("U:"+counterU);
		System.out.println(+counterConsonent);
		 
		
	}
	
	
	



}
