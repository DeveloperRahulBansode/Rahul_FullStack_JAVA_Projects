package com.enumeration.study;

public class MainEnumeration {
	enum userAccess {
		ACTIVE(1, "Active User", "All Access"), 
		INACTIVE(2, "Inactive User", "Not Acess At All"),
		SUSPENDED(3, "Suspended User", "Login Acess For Particular Think"),
		BLOCK(4,"Blocked User","No Access at Any Resone");

		private int srNo;
		private String descreption;
		private String access;

		private userAccess(int srNo, String descreption, String access) {
			this.srNo = srNo;
			this.descreption = descreption;
			this.access = access;
		}

		public int getSrNo() {
			return srNo;
		}

		public void setSrNo(int srNo) {
			this.srNo = srNo;
		}

		public String getDescreption() {
			return descreption;
		}

		public void setDescreption(String descreption) {
			this.descreption = descreption;
		}

		public String getAccess() {
			return access;
		}

		public void setAccess(String access) {
			this.access = access;
		}

	}

	public static void main(String[] args) {
		System.out.println(userAccess.ACTIVE);

		System.out.println(userAccess.INACTIVE.getSrNo());

		System.out.println(userAccess.ACTIVE.getDescreption());

		for (userAccess userAccess : userAccess.values()) {
			System.out.println(userAccess.getSrNo() + "." +userAccess.name()+"."+ userAccess.getDescreption()
			+ "." + userAccess.getAccess());
		}

	}

}
