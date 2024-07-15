package ststic.demo;

public class MainStaticMethodDmo {
	int val1=10;
	
	public static void main(String args[]) {
		

		MainStaticMethodDmo msd=new MainStaticMethodDmo();
		msd.showMessage();
		
	}
	public void showMessage() {
		System.out.println("SHOW Message");
	}

}
