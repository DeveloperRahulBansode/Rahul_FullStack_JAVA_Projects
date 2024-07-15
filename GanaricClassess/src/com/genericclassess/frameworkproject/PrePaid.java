package com.genericclassess.frameworkproject;

public class PrePaid implements MobileBill<PrePaid>,Payabal {
	
	 private Integer noOfDays;

		public Integer getNoOfDays() {
			return noOfDays;
		}

		public void setNoOfDays(Integer noOfDays) {
			this.noOfDays = noOfDays;
		}

		@Override
		public Float generateBill(PrePaid noOfDays) {
			return noOfDays.getNoOfDays()*30.5F;
		}

}
