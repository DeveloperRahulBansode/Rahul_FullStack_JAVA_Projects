package com.genericclassess.frameworkproject;

@FunctionalInterface
public interface MobileBill<T extends Payabal> {
	
	public Float generateBill(T noOfDays);

}
