package ststic.demo;

public class MainStaticDemo {
	
	public static void main(String args[]) {
		
		System.out.println(StaticDemo.pincode);
		StaticDemo sdobj=new StaticDemo();
		System.out.println(sdobj.pincode1);
		sdobj.pincode1=2;
		
		StaticDemo sdobj1=new StaticDemo();
		StaticDemo.pincode=410201;
		System.out.println(sdobj.pincode);
		System.out.println(sdobj1.pincode);
		
		System.out.println(sdobj.pincode1);
		System.out.println(sdobj1.pincode1);
		
		sdobj.pincode=123;
		System.out.println(sdobj.pincode);
		System.out.println(sdobj1.pincode);
		
		

	}

}
