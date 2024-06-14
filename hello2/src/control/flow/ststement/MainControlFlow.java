package control.flow.ststement;

public class MainControlFlow {
	
	public static void main(String args[]) {
		
		int no=545;
		int temp=no;
		int sum=0;
		
		//reverse number with pelendrom
		
		while(no!=0) {
			System.out.println(sum=sum*10+(no%10));
			no=no/10;
		}
		if(temp==sum) {
			System.out.println("number is palendrom");
		}
		
		//Armstrong number
		
		no=321;
		temp=no;
		while(no!=0) {
			
			sum = sum + (int)Math.pow(no%10,3);
			no=no/10;
			System.out.println(sum);
		}
		
		if(sum==temp) {
			System.out.println("NUmber is Armstrong");
		}
		else {
			System.out.println("Number is NOT Armstrong");
		}
		
		// Power calculation
		PowerCalculation pwr=new PowerCalculation(10,3);
		System.out.println(pwr.power());
		
		// TABLE  USING FOR LOOP
		
		for(int j=1;j<=10;j++) {
			int num=j;
			for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		}
		// print odd even using continue
		for(int j=1;j<=10;j++) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even NUmber="+j+"*"+i+"="+(j*i));
				continue;
			}
			else {System.out.println("Odd Number="+j+"*"+i+"="+(j*i));}
		}
		
		}
		// mark continue
		mark:
		for(int j=1;j<=10;j++) {
			for(int i=1;i<=10;i++) {
				if(i%2==0) 
					continue mark;
				
				System.out.println("Odd NUmber="+j+"*"+i+"="+(j*i));
				
				//else {System.out.println("Odd Number="+j+"*"+i+"="+(j*i));}
			}
			
			}
		
		//
		
		
			
				
	}
	

}
