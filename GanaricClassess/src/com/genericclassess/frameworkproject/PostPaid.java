package com.genericclassess.frameworkproject;

public class PostPaid implements MobileBill<PostPaid>,Payabal{
	 private Integer noOfDays;

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public Float generateBill(PostPaid noOfDays) {
		return noOfDays.getNoOfDays()*20.5F;
	}
	 
	 

}
