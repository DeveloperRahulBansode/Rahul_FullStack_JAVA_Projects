package com.genericclassess.frameworkproject;

public class App {
	public static void main(String[] args) {
		PrePaid jio=new PrePaid();
		jio.setNoOfDays(30);
		float prebill=jio.generateBill(jio);
		System.out.println(prebill);
		
		PostPaid jio1=new PostPaid();
		jio1.setNoOfDays(30);
		float posbill=jio1.generateBill(jio1);
		System.out.println(posbill);
		
		
		MobileBill<PrePaid> obj=(jiosim->10.10F*jiosim.getNoOfDays());
		Float billPrePaid=obj.generateBill(jio);
		System.out.println(billPrePaid);
		
		MobileBill<PostPaid> obj1=(jiosim1->30.10F*jiosim1.getNoOfDays());
		Float billPostPaid=obj1.generateBill(jio1);
		System.out.println(billPostPaid);
	}

}
